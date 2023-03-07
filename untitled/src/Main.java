import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circle c = new Circle(getRadiusFromUser());
        System.out.println("Perimiter of circle: "+c.getPerimeter());
        System.out.println("Area of circle: "+c.getArea());

        ResizableCircle rc=new ResizableCircle(getPercentFromUser());
        System.out.println("Perimiter of RC circle"+rc.getPerimeter());
        System.out.println("Area of RC circle: "+rc.getArea());
    }
//add a comment
    public static int getRadiusFromUser() {
        Scanner input = new Scanner(System.in);
        int radius=0;

        do {
            if (radius <=0) {
                System.out.println("Enter positive value for radius: ");
                radius = input.nextInt();
            }
            return radius;
        } while (radius < 0);
    }

    public static int getPercentFromUser(){
        Scanner input = new Scanner(System.in);
        int percent=-200;
        do{
            if(percent<-100||percent>100){
                System.out.println("Please re-enter a value between -100 to +100 : ");
                percent=input.nextInt();
            }
            return percent;
        }while (percent<100||percent>100);
    }
}

