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



}



