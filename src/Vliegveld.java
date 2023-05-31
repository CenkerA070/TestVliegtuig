public class Vliegveld {
    private int tegenwind;
    private boolean opstijgToestemming;
    private boolean landToestemming;


    public int getTegenwind() {
        return tegenwind;
    }

    public void setTegenwind(int tegenwind) {
        this.tegenwind = tegenwind;
    }

    public Vliegveld(int tegenwind, boolean opstijgToestemming, boolean landToestemming) {
        this.tegenwind = tegenwind;
        this.opstijgToestemming = opstijgToestemming;
        this.landToestemming = landToestemming;
    }

    public boolean kanOpstijgen(boolean opstijgToestemming, int gewicht, int tegenwind) {
        if (opstijgToestemming && (gewicht <= 1000 || tegenwind >= 50)) {
            return true;
        } return false;
    }

    public boolean isLandToestemming() {
        return landToestemming;
    }

    public void setLandToestemming(boolean landToestemming) {
        this.landToestemming = landToestemming;
    }

    public double landPrijs(Vliegtuig vliegtuig) {
        double totaalprijs = 0.0;

        if (landToestemming && vliegtuig.getGewicht() <= 1000) {
            totaalprijs += 100;
        } else if (landToestemming && vliegtuig.getGewicht() > 1000 && vliegtuig.getGewicht() < 5000) {
            totaalprijs += 500;
        } else if (landToestemming && vliegtuig.getGewicht() >= 5000) {
            totaalprijs += 2500;
        }

        if (vliegtuig.getPassagiers() >= 2) {
            totaalprijs *= 1.5;
        }

        if (vliegtuig.isBagage()) {
            return totaalprijs += 800.0;
        }

        if (vliegtuig.getLand().equals("Nederland") || vliegtuig.getLand().equals("NL")) {
            totaalprijs *= 1.21;
        }

        return totaalprijs;
    }
}