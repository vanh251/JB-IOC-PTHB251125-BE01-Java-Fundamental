package session08.bai_4;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Rectangle> r = new ArrayList<>();
        Rectangle r1= new Rectangle(3,4); r.add(r1);
        Rectangle r2= new Rectangle(5,2); r.add(r2);
        Rectangle r3= new Rectangle(4.5,3.5); r.add(r3);

        int cnt = 0;
        double maxArea = r.get(0).getArea();
        for(Rectangle rec : r){
            if(rec.getArea() > maxArea){
                maxArea = rec.getArea();
                cnt = 1;
            } else if(rec.getArea() == maxArea){
                cnt++;
            }
            System.out.println(rec.toString());
        }

        if(cnt>1){
            System.out.println("There are " + cnt + " rectangles with the largest area of " + maxArea);
        } else {
            System.out.println("There is 1 rectangle with the largest area of " + maxArea);
        }
    }
}
