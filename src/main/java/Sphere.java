class Sphere {
    private double r;

    Sphere(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "r = " + r;
    }

    double sferosPlotas(){
        if (r == 0)
            throw new IllegalArgumentException("Spindulys lygus 0");
        else
            return 4*3.14*r*r;
    }

    double sferosTuris(){
        if (r == 0)
            throw new IllegalArgumentException("Spindulys lygus 0");
        else
            return (4.0/3.0)*3.14*(r*r*r);
    }
}
