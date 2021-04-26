package model;

public class Number extends AbstractLegalSymbol {
    public Number(char LegalSymbol) {
        super(LegalSymbol);
    }

    @Override
    int priority(char legalSymbol) {
        return Integer.MIN_VALUE;
    }
}
