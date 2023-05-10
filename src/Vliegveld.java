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


    public boolean OpstijgToestemming(Vliegtuig vliegtuig) {
        if (vliegtuig.getGewicht() <= 1000 || getTegenwind() >= 50) {
            return true;
        }
        return false;
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
        } else if (landToestemming && vliegtuig.getGewicht() > 1000 && vliegtuig.getGewicht() <= 5000) {
            totaalprijs += 500;
        } else if (landToestemming && vliegtuig.getGewicht() > 5000) {
            totaalprijs += 2500;
        }

        if (vliegtuig.getPassagiers() >= 2) {
            totaalprijs *= 1.5;
        }

        if (vliegtuig.getLand().equals("Nederland") || vliegtuig.getLand().equals("NL")) {
            totaalprijs *= 1.21;
        }

        if (vliegtuig.isBagage() && landToestemming) {
            return totaalprijs += 800.0;
        }

        return totaalprijs;
    }
}