package Lesson10.Lesson10PracticaInterface;

public class Sapogi extends Obuv implements ObuvFOFIx{

    @Override
    public String sole() {
        return null;
    }

    @Override
    public String kindOfMaterial() {
        return null;
    }

    @Override
    public int condition() {
        return 0;
    }

    @Override
    public void pochinit() {
        System.out.println("мы чиним сапоги");
    }
}
