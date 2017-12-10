class Line {

    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    double rastiNuolydi() {
        return (y2-y1)/(x2-x1);
    }

    double rastiIlgi() {
        return Math.sqrt( (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2) );
    }

    boolean arLygiagrecios(Line line) {
        if (line.rastiNuolydi()==this.rastiNuolydi())
            return true;
        else
            return false;
    }
}
