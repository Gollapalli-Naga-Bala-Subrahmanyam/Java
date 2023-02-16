package com.epam.rd.autotasks;

public class CarouselRun {
    protected final int[] arr = DecrementingCarousel.carousel.clone();
    protected int position = 0;
    public int next() {
        if (isFinished())
            return -1;
        else {
            while (arr[position %= array.length] <= 0) {
                position++;
            }
        }
        return arr[position++]--;
    }
    public boolean isFinished() {
        for (int el : arr)
            if (el > 0)
                return false;
        return true;
    }
}
