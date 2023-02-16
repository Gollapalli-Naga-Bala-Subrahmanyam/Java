package com.epam.rd.autotasks;
public class DecrementingCarousel {
    private final  int capacity;
    int counter ;
    static int [] array ;
    boolean isRun;
    {
        counter=0;
        isRun=false;
    }
    public DecrementingCarousel(int capacity) {
        this.capacity=capacity;
        array=new int[capacity];
    }

    public boolean addElement(int element){
        if(counter<capacity && element>0 &&!isRun){
            array[counter++]=element;
            return true;
        }
        return false;
    }
    public CarouselRun run(){
        if (!isRun) {
            isRun = true;
            return new CarouselRun();
        }
        return null;
    }
}
