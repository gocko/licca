package Languages.scheme;

public class Obj {
    static final int
            Con = 0, Var = 1, Type = 2, Meth = 3;
    int kind;       //Con, Var, Type, Meth;
    String name;
    Struct type;
    Obj next;
    int val;        //Con: value
    int adr;        //Var, Meth: address
    int level;      //Var: 0 = global, 1 = local
    int nPars;      //Meth: number of parameters
    Obj locals;     //Meth: parameters and local objects
    String strval;

    public Obj(int kind, String name, Struct type){
        this.kind = kind;
        this.name = name;
        this.type = type;
    }
}
