package Lesson10.Lesson10PracticaInterface;

public class Tufli extends Obuv implements ObuvFOFIx{

    private String kindOfMaterial;


    @Override
    public void pochinit(){
        System.out.println("мы чиним туфли");
    }

    @Override
    public String sole() {
        return null;
    }

    @Override
    public String kindOfMaterial() {
        return kindOfMaterial;
    }

    @Override
    public int condition() {
        return 0;
    }
}
