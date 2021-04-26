package model;

public enum AdditionalSymbole2Enum {


    reset ('C'),
    parentheseOpen('('),
    parentheseClose(')');

    private  char  symbole;

    AdditionalSymbole2Enum(char symbol){
        this.symbole = symbol;

    }

    public char getSymbole() { return symbole; }

    public int getPriority(char symbole)
    {
        int priority = 0;
        switch (symbole) {
            case '(':
                priority = Integer.MAX_VALUE;
                break;
            case ')':
                priority = 0;
                break;
            default:
                priority = Integer.MIN_VALUE;
        }
        return priority;
    }
}
