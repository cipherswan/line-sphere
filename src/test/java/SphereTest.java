import org.junit.Assert;
import org.junit.Test;

public class SphereTest {

    @Test (expected = IllegalArgumentException.class)
    public void kaiSpindulysNulisSkaiciuojantPlotaIsmetamasException(){

    }

    @Test
    public void kaiSpidulys2YraGaunamasSferosPlotas(){
        Sphere sp = new Sphere(2);
    }

    @Test
    public void kaiSpidulys4YraGaunamasSferosPlotas(){
        Sphere sp = new Sphere(4);
    }

    @Test
    public void kaiSpidulys6YraGaunamasSferosPlotas(){
        Sphere sp = new Sphere(6);
    }

    @Test (expected = IllegalArgumentException.class)
    public void kaiSpindulysNulisSkaiciuojantTuriIsmetamasException(){

    }


    @Test
    public void kaiSpidulys2YraGaunamasSferosTuris(){
        Sphere sp = new Sphere(2);
    }

    @Test
    public void kaiSpidulys4YraGaunamasSferosTuris(){
        Sphere sp = new Sphere(4);
    }

    @Test
    public void kaiSpidulys6YraGaunamasSferosTuris(){
        Sphere sp = new Sphere(6);
    }

}
