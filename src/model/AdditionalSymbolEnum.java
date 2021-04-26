package model;

public enum AdditionalSymbolEnum {

    point('.'),
    egal('=');

    private  char  symbol;
    AdditionalSymbolEnum(char symbol){
        this.symbol = symbol;

    }
    public  char getSymbol ()
    {
        return  symbol;
    }
}
