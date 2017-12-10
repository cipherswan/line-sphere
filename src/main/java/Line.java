class Line {

    private double x1, y1, x2, y2;

    Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    double rastiNuolydi() {
        if (x1 == 0 && x2 == 0){
        throw new IllegalArgumentException("Dalyba is nulio");
        }
        else
            return (y2-y1)/(x2-x1) ;
    }

    double rastiIlgi() {
        return Math.sqrt( (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2) );
    }

    boolean arLygiagrecios(Line line) {
        return line.rastiNuolydi() == this.rastiNuolydi();
    }
}
