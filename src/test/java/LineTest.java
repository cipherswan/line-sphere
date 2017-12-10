import org.junit.Assert;
import org.junit.Test;

public class LineTest {

    @Test
    public void kaiYraDuomenysRandamasNuolydisNeigiamas(){
        Line line = new Line(-2,3, 1, -1);
        assert(line.rastiNuolydi() < 0);
    }

    @Test
    public void kaiYraDuomenysRandamasNuolydis0(){
        Line line = new Line(2,1, 4, 1);
        assert(line.rastiNuolydi()==0);
    }

    @Test
    public void kaiYraDuomenysRandamasNuolydisTeigiamas(){
        Line line = new Line(2,1, 4, 7);
        assert(line.rastiNuolydi()>0);
    }

    @Test (expected = IllegalArgumentException.class)
    public void kaiYraDuomenysIrDalinamaIsNulioIsmetamasException(){
        Line line = new Line(0, 1, 0, 7);
        line.rastiNuolydi();
    }

    @Test
    public void kaiIvedamiDuomenysTiesesIlgisYra1(){
        Line line = new Line(0,0,1,1);
        Assert.assertEquals(1, line.rastiIlgi(), 1);
    }

    @Test
    public void kaiIvedamiDuomenysTiesesIlgisYra0(){
        Line line = new Line(0,0,0,0);
        Assert.assertEquals(0, line.rastiIlgi(), 1);
    }

    @Test
    public void kaiTiesesVienodosJosYraLygiagrecios(){
        Line line = new Line(2, 1, 4, 7);
        Line line2 = new Line(2, 1, 4, 7);
        Assert.assertEquals(true, line.arLygiagrecios(line2));
    }

    @Test
    public void kaiTiesesVienodosPerVienaJosYraLygiagrecios(){
        Line line = new Line(2,1,4,7);
        Line line1 = new Line(1,0,3,6);
        Assert.assertEquals(true, line.arLygiagrecios(line1));
    }

    @Test
    public void kaiTiesesNevienodosJosYraNelygiagrecios(){
        Line line = new Line(2, 1, 4, 7);
        Line line2 = new Line(1, 1, 4, 7);
        Assert.assertEquals(false, line.arLygiagrecios(line2));
    }




}



