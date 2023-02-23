public class Element {
    private final String symbol;
    private final int neutroner;
    private final int protoner;

    private final double massa;

    public Element(String symbol, int neutroner, int protoner, double massa) {
        this.symbol = symbol;
        this.neutroner = neutroner;
        this.protoner = protoner;
        this.massa = massa;
    }

    public double getNeutronMassaInU(){
        return this.neutroner * 1.00866491597;
    }
    public double getProtonMassaInU(){
        return this.protoner * 1.007276466812;
    }

    private double getElektronMassaInU(){
        return 0.00054857990946;
    }

    private double getTotalElektronMassaInU(){
        return this.protoner * getElektronMassaInU();
    }

    public double getBindningsernergiInMeV(){
        //round to 6 decimal
        return ((this.massa - getTotalElektronMassaInU()) - (this.getNeutronMassaInU() + this.getProtonMassaInU())) * 931.5 * -1;

    }

    public String getSymbol() {
        return symbol;
    }
}
