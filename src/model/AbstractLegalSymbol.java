package model;

public abstract class AbstractLegalSymbol {
    private  char  legalSymbol;

    public AbstractLegalSymbol(char LegalSymbol   )
    {
        this.legalSymbol=LegalSymbol;
    }


    abstract int priority(char legalSymbol) ;



}
