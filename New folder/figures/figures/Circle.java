package com.epam.rd.autotasks.figures;

class Circle extends Figure {
    double x1,y1,r,res;
    public Circle(Point A, double r) {
        this.x1 = A.getX();
        this.y1 = A.getY();
        this.r = r;
        res = Math.abs(Math.PI * (r*r));
    }
    public String toString(){
        String s = pointsToString();
        return this.getClass().getSimpleName() + "[" + s+r + "]";
    }
    @Override
    public double area() {
        return res;
    }

    @Override
    public String pointsToString() {
        return "("+x1+","+y1+")";
    }
    @Override
    public Point leftmostPoint() {
        double x = x1-r;
        Point p = new Point(x,y1);
        return p;
    }
}
