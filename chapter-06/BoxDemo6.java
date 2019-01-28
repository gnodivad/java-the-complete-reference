/**
 * C06 L06
 * 
 * Box uses a constructor to initialize the dimensions of a box.
 */
public class BoxDemo6 {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        vol = mybox1.computeVolume();
        System.out.println("Volume is " + vol);

        vol = mybox2.computeVolume();
        System.out.println("Volume is " + vol);
    }
}