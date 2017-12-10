import org.junit.Assert;
import org.junit.Test;

public class SphereTest {

    @Test (expected = IllegalArgumentException.class)
    public void kaiSpindulysNulisSkaiciuojantPlotaIsmetamasException(){
        Sphere sp = new Sphere(0);
        sp.sferosPlotas();
    }

    @Test
    public void kaiSpidulys2YraGaunamasSferosPlotas(){
        Sphere sp = new Sphere(2);
        Assert.assertEquals(50.24, sp.sferosPlotas(), 0.001);
    }

    @Test
    public void kaiSpidulys4YraGaunamasSferosPlotas(){
        Sphere sp = new Sphere(4);
        Assert.assertEquals(200.96, sp.sferosPlotas(), 0.001);
    }

    @Test
    public void kaiSpidulys6YraGaunamasSferosPlotas(){
        Sphere sp = new Sphere(6);
        Assert.assertEquals(452.159, sp.sferosPlotas(), 0.001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void kaiSpindulysNulisSkaiciuojantTuriIsmetamasException(){
        Sphere sp = new Sphere(0);
        sp.sferosTuris();
    }


    @Test
    public void kaiSpidulys2YraGaunamasSferosTuris(){
        Sphere sp = new Sphere(2);
        Assert.assertEquals(33.493, sp.sferosTuris(), 0.001);
    }

    @Test
    public void kaiSpidulys4YraGaunamasSferosTuris(){
        Sphere sp = new Sphere(4);
        Assert.assertEquals(267.946, sp.sferosTuris(), 0.001);
    }

    @Test
    public void kaiSpidulys6YraGaunamasSferosTuris(){
        Sphere sp = new Sphere(6);
        Assert.assertEquals(904.319, sp.sferosTuris(), 0.001);
    }

}
