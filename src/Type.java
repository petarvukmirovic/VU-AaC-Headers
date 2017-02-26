
public class Type {

    private final String _name;
    private final int _starNr;

    public Type(String name, int starNr){
        _name = name;
        _starNr = starNr;
    }

    public Type(String name){
        this(name, 0);
    }

    public String toString(){
        if (_name .equals("char") && _starNr != 0){
            return toJavaArr("String", _starNr-1);
        }
        else {
            return toJavaArr();
        }
    }

    private String toJavaArr(String typeName, int starNr) {
        StringBuffer buffer = new StringBuffer(typeName);
        for(int i=0; i<starNr; i++){
            buffer.append("[]");
        }

        return buffer.toString();
    }

    private String toJavaArr(){
        return toJavaArr(_name, _starNr);
    }
}
