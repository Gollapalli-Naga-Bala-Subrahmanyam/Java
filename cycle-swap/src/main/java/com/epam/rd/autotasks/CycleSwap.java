import java.util.*;

public class CycleSwap {
    public static void cycleSwap(int[] array) {
        if(array.length == 0)
        {
            return;
        }
        int[] result = new int[array.length];
        System.arraycopy(array,array.length-1,result,0,1);
        System.arraycopy(array,0,result,1,array.length-1);
        System.arraycopy(result, 0, array, 0, result.length);
    }

    static void cycleSwap(int[] array, int shift) {
        if(array.length==0)
            return;
        if(shift==array.length)
        {
            return;
        }
        else
        {
            int[] result = new int[array.length];
            System.arraycopy(array, array.length - shift, result, 0, shift);
            System.arraycopy(array, 0, result, shift, array.length - shift);
            System.arraycopy(result, 0, array, 0, result.length);
        }
    }
}