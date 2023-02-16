package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {
    protected int position = 0;

    public HalvingCarousel(final int capacity) {

        super(capacity);
    }

    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new CarouselRun() {
                @Override
                public int next() {
                    if (isFinished())
                        return -1;
                    else {
                        while (array[position %= array.length]<1) {
                            position++;
                        }
                    }
                    int y = array[position];
                    array[position] = array[position] / 2;
                    position++;
                    return y;
                }

                @Override
                public boolean isFinished() {
                    for (int el : array)
                        if (el >=1)
                            return false;
                    return true;
                }
            };
        }
        return null;
    }
}
