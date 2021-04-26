package model;

public class Operateur extends AbstractLegalSymbol {

    public Operateur(char LegalSymbol) {
        super(LegalSymbol);
    }

     int priority(char legalSymbol) {
        int  priority=Integer.MIN_VALUE;
        for (OperateurEnum p : OperateurEnum.values())
        {
            if (p.getSymbole()==legalSymbol)
            {
                priority =p.getPriority(legalSymbol);
                break;
            }
        }
        return priority;
    }

}
