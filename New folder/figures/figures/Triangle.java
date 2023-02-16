package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    double x1,x2,y1,y2,x3,y3,res,area;
    public Triangle(Point A, Point B, Point C) {
        x1 = A.getX();
        y1 = A.getY();
        x2 = B.getX();
        y2 = B.getY();
        x3 = C.getX();
        y3 = C.getY();
        res = ((x1*(y2-y3)) + (x2*(y3-y1)) + (x3*(y1-y2)));
        if(res == 0){
            throw new IllegalArgumentException("Invalid points");
        }
    }

    @Override
    public double area() {
        if((x1==0 && y1==0) || (x2==0 && y2==0) || (x3==0 && y3==0)){
            double x = x2*y3;
            double y = y2*x3;
            area = (x-y)/2;
        }
        else{
            area = (Math.abs(res))/2;
        }
        return area;
    }

    @Override
    public String pointsToString() {
        return "("+x1+","+y1+")"+"("+x2+","+y2+")"+"("+x3+","+y3+")";
    }


    @Override
    public Point leftmostPoint() {
        double min = (x1<x2) ? (x1<x3 ? x1 : x3) : (x2<x3 ? x2 : x3);
        Point p = new Point(min,-area);
        return p;
    }
}
