package model;


public enum OperateurEnum
{

    exposant ('^'),
    multiplication ('*'),
    division ('/'),
    addition ('+'),
    soustraction('-'),
    sqrt('√');

    private  char  symbole;

    OperateurEnum(char symbol){
        this.symbole = symbol;

    }

    public char getSymbole() { return symbole; }

    public int getPriority(char symbole)
    {
        int priority = 0;
        switch (symbole) {
            case '^':
                priority = 3;
                break;
            case '/':
                priority = 2;
                break;
            case '*':
                priority = 2;
                break;
            case '+':
                priority = 1;
                break;
            case '-':
                priority = 1;
                break;
            default:
                priority = Integer.MIN_VALUE;
        }
        return priority;
    }
}
