public class Vliegtuig {
    private String merk;
    private String merkNummer;
    private String vliegtuig;
    private String land;
    private int passagiers;
    private int gewicht;
    private boolean bagage;


    public void setVliegtuig(String vliegtuig) {
        this.vliegtuig = getMerk() + getMerkNummer();
    }

    public String getVliegtuig() {
        return vliegtuig;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerkNummer() {
        return merkNummer;
    }

    public void setMerkNummer(String merkNummer) {
        this.merkNummer = merkNummer;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getPassagiers() {
        return passagiers;
    }

    public void setPassagiers(int passagiers) {
        this.passagiers = passagiers;
    }

    public boolean isBagage() {
        return bagage;
    }

    public void setBagage(boolean bagage) {
        this.bagage = bagage;
    }

}
