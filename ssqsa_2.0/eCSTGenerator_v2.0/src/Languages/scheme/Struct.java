package Languages.scheme;

public class Struct {
    static final int    //type kinds
        None = 0, Int = 1, Char = 2, Arr = 3, Class = 4;
    int kind;           //None, Int, Char, Arr, Class
    Struct elemType;    //Arr: element type
    int nFields;        //Class: number of fields
    Obj fields;         //Class: list of fields

    public Struct(int kind) {
        this.kind = kind;
    }

    public Struct(int kind, Struct elemType) {
        this.kind = kind;
        this.elemType = elemType;
    }

    public boolean isRefType(){
        return kind == Class || kind == Arr;
    }

    //Checks if two types are the same
    public boolean equals(Struct other){
        if(kind == Arr)
            return (other.kind == Arr && (other.elemType == elemType || other.elemType == SymbolTable.noType));
        else
            return (other == this);
    }

    //Checks if two types are compatible
    public boolean compatibleWith(Struct other){
        return (this.equals(other)
                || this == SymbolTable.nullType && other.isRefType()
                || other == SymbolTable.nullType && this.isRefType());
    }

    //Checks if "this" is assignable to "other"
    public boolean assignableTo(Struct other){
        return (this.equals(other)
                || this == SymbolTable.nullType && other.isRefType());
    }
}