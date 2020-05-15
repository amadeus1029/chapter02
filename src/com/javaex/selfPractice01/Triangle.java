package com.javaex.selfPractice01;

public class Triangle {
    private double x1,y1,x2,y2,x3,y3;
    public void setX(int i,int x) {
        if(i==0) {
            this.x1 = (double)x;
        } else if(i==1) {
            this.x2 = (double)x;
        } else {
            this.x3 = (double)x;
        }
    }
    public void setY(int i,int y) {
        if(i==0) {
            this.y1 = (double)y;
        } else if(i==1) {
            this.y2 = (double)y;
        } else {
            this.y3 = (double)y;
        }
    }

    public void showInfo() {
        System.out.println(this.x1+" "+this.x2+" "+this.x3+", "+this.y1+" "+this.y2+" "+this.y3);
    }

    public double getSize() {
        double result = 0.5 * Math.abs(((this.x1*this.y2)+(this.x2*this.y3)+(this.x3*this.y1)) - ((this.x1*this.y3)+(this.x3*this.y2)+(this.x2*this.y1)));
        return result;
    }
}
