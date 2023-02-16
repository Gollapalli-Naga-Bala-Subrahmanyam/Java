package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    int max;
    int counter=0;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {

        super(capacity);
        this.max=actionLimit;
    }


    @Override
    public CarouselRun run() {
        if (!isRun) {
            isRun = true;
            return new CarouselRun(){
                public int next() {

                    if (isFinished() || counter>max)
                        return -1;
                    else {
                        while (array[position %= array.length] <= 0) {
                            position++;
                        }
                    }
                    counter++;
                    return array[position++]--;
                }
                public boolean isFinished() {
                    for (int el : array)
                        if (el > 0 && counter<max)
                            return false;
                    return true;
                }

            };
        }
        
        return null;
    }
}
