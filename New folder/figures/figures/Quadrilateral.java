package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure {
    double x1,x2,y1,y2,x3,y3,x4,y4,res,area;
    public Quadrilateral(Point A, Point B, Point C, Point D) {
        x1 = A.getX();
        y1 = A.getY();
        x2 = B.getX();
        y2 = B.getY();
        x3 = C.getX();
        y3 = C.getY();
        x4 = D.getX();
        y4 = D.getY();
        res = (x1*y2 + x2*y3 + x3*y4 + x4*y1) - (x2*y1 + x3*y2 + x4*y3 + x1*y4);
    }

    @Override
    public double area() {
        area = (Math.abs(res))/2;
        return area;
    }

    @Override
    public String pointsToString() {
        return "("+x1+","+y1+")"+"("+x2+","+y2+")"+"("+x3+","+y3+")"+"("+x4+","+y4+")";
    }

    @Override
    public Point leftmostPoint() {
        double min1 = (x1<x2) ? (x1<x3 ? x1 : x3) : (x2<x3 ? x2 : x3);
        double min2 = (min1<x4 ? min1 : x4);
        Point p = new Point(min2,-area);
        return p;
    }
}
