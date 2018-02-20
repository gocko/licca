package Languages.scheme;

public class SymbolTable {

    static Scope topScope;      //current top scope
    static int level;           //nesting level of current scope

    static Struct intType;      //predefined types
    static Struct charType;
    static Struct nullType;
    static Struct noType;

    static Obj chrObj;          //predefined objects
    static Obj ordObj;
    static Obj lenObj;
    static Obj noObj;

    static final String CALL_CC = "call-with-current-continuation";

    static String callCCName = "";

    static Obj insert(int kind, String name, Struct type) {
        // Create object node
        Obj obj = new Obj(kind, name, type);
        if (kind == Obj.Var) {
            obj.adr = topScope.nVars; topScope.nVars++;
            obj.level = level;
        }
        // Append object node
        Obj p = topScope.locals, last = null;
        while (p != null) {
            if (p.name.equals(name))
                error(name + "declared twice");
            last = p;
            p = p.next;
        }
        if (last == null)
            topScope.locals = obj;
        else last.next = obj;
        return obj;
    }

    static Obj insert(String name) {
        // Create object node
        Obj obj = new Obj(Obj.Var, name, null);
        obj.adr = topScope.nVars; topScope.nVars++;
        obj.level = level;
        // Append object node
        Obj p = topScope.locals, last = null;
        while (p != null) {
            if (p.name.equals(name))
                error(name + "declared twice");
            last = p;
            p = p.next;
        }
        if (last == null)
            topScope.locals = obj;
        else last.next = obj;
        return obj;
    }

    static Obj find(String name) {
        for(Scope s = topScope; s != null; s = s.outer)
            for(Obj p = s.locals; p != null; p = p.next)
                if(p.name.equals(name)) return p;
        //error(name + " is undeclared");
        return noObj;
    }

    static boolean contains(String name) {
        for(Scope s = topScope; s != null; s = s.outer)
            for(Obj p = s.locals; p != null; p = p.next) {
                if(p.name.equals(name))
                    return true;
            }
        return false;
    }

    static boolean isOperator(String name) {
        if (name.equals("+") || name.equals("-") || name.equals("+") ||
        	name.equals("*") || name.equals("/") || name.equals("abs") ||
            name.equals("quotient") || name.equals("remainder") ||
            name.equals("gcd") || name.equals("lcm") || name.equals("expt") ||
            name.equals("sqrt") || name.equals("set!"))
            return true;
        return false;
    }
    static boolean isComparisonOperator(String name) {
        if (name.equals("<") || name.equals(">") ||
            name.equals("<=") || name.equals(">=") || name.equals("=")
            )
            return true;
        return false;
    }

    // Retrieve a class field with the given name from the fields of "type"
    public static Obj findField(String name, Struct type) {
        for(Obj f = type.fields; f != null; f = f.next)
            if(f.name.compareTo(name)==0) return f;
        error(name + " is undeclared");
        return noObj;
    }

    static void openScope() {
        Scope s = new Scope();
        s.outer = topScope;
        topScope = s;
        level++;
    }

    static void closeScope() {
        topScope = topScope.outer;
        level--;
    }

    static void init() {
        Obj o;
        topScope = new Scope();
        topScope.outer = null;
        level = -1;

        // create predeclared types
        intType = new Struct(Struct.Int);
        charType = new Struct(Struct.Char);
        nullType = new Struct(Struct.Class);
        noType = new Struct(Struct.None);
        noObj = new Obj(Obj.Var, "???", noType);

        // create predeclared objects
        insert(Obj.Type, "int", intType);
        insert(Obj.Type, "char", charType);
        insert(Obj.Con, "null", nullType);
        chrObj = insert(Obj.Meth, "chr", charType);
        chrObj.locals = new Obj(Obj.Var, "i", intType);
        chrObj.nPars = 1;
        ordObj = insert(Obj.Meth, "ord", intType);
        ordObj.locals = new Obj(Obj.Var, "ch", charType);
        ordObj.nPars = 1;
        lenObj = insert(Obj.Meth, "len", intType);
        lenObj.locals = new Obj(Obj.Var, "a", new Struct(Struct.Arr, noType));
        lenObj.nPars = 1;
    }

    static void error(String message) {
        System.err.println(message);
    }
}
