public class Vliegtuig {
    private String merk;
    private String land;
    private int passagiers;
    private double gewicht;
    private boolean bagage;

    public Vliegtuig(String merk, String land, int passagiers, double gewicht, boolean bagage) {
        this.merk = merk;
        this.land = land;
        this.passagiers = passagiers;
        this.gewicht = gewicht;
        this.bagage = bagage;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
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
