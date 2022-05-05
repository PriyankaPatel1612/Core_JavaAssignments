package Assignment2;
import java.util.Scanner;

public class Assignment_2 {

    public static void main(String[] args) throws Exception
    {

        Scanner scan = new Scanner(System.in);
        boolean flag = true;


        System.out.println("Choose the number to find the area and perimeter of any shape : ");
        System.out.println("1. Circle ");
        System.out.println("2. Rectangle ");
        System.out.println("3. Triangle");
        System.out.println("4. Square ");
        System.out.println("5. Sphere ");
        System.out.println("6. Cylinder ");
        System.out.println("7. Cone ");
        System.out.println("8. Exit ");



        Circle obj1 = new Circle();
        Rectangle obj2 = new Rectangle();
        Triangle obj3 = new Triangle();
        Square obj4 = new Square();
        Sphere obj5 = new Sphere();
        Cylinder obj6 = new Cylinder();
        Cone obj7 = new Cone();



        while( flag == true) {
            System.out.print("Enter your Choice : ");
            int choose = scan.nextInt();

            switch (choose) {

                case 1:
                    obj1.circle();
                    break;

                case 2:
                    obj2.rectangle();
                    break;

                case 3:
                    obj3.triangle();
                    break;

                case 4:
                    obj4.square();
                    break;

                case 5:
                    obj5.sphere();
                    break;

                case 6:
                    obj6.cylinder();
                    break;

                case 7:
                    obj7.cone();
                    break;

                case 8:
                    System.out.println("thankyou !");
                    flag=false;
                    break;
            }
        }
    }
}

/*
class Circle
{
    float circle()
    {

        Scanner scan = new Scanner(System.in);
        float pie = 3.14f;
        System.out.println("You choosed circle " );
        System.out.print("Enter the radius : ");
        float radius = scan.nextFloat();
        float area = pie * radius * radius;
        float circumference = 2*pie*radius;
        System.out.println("Area of circle is : " + area);
        System.out.println("Circumference of circle : "+ circumference);
        return area;

    }
}

class Rectangle
{
    float rectangle()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("You choosed rectangle " );
        System.out.print("Enter the length of rectangle : ");
        float length = scan.nextFloat();
        System.out.print("Enter the breadth of rectangle : ");
        float breadth = scan.nextFloat();
        float area = length * breadth;
        float perimeter = 2 * (length + breadth);
        System.out.println("Area of rectangle is : " + area);
        System.out.println("Perimeter of rectangle is : " + perimeter);
        return area;
    }
}


class Triangle
{
    float triangle()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("You choosed triangle ");
        System.out.print("Enter the breadth of triangle");
        float breadth = scan.nextFloat();
        System.out.print("Enter the height of triangle");
        float height = scan.nextFloat();
        float area = 1/2*breadth*height;
        System.out.println("Area of triangle is : " + area);
        return area;
    }
}


class Square
{
    float square()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("You choosed square ");
        System.out.print("Enter the side of square a : ");
        float a = scan.nextFloat();
        float area = a*a;
        float perimeter = 4*a;
        System.out.println("Area of square is : " + area);
        System.out.println("Perimeter of aquare is : " + perimeter);
        return area;
    }
}

class Sphere
{
    float sphere()
    {
        float pie = 3.14f;
        Scanner scan = new Scanner(System.in);
        System.out.println("You choosed sphere ");
        System.out.print("Enter the radius of sphere : ");
        float radius = scan.nextFloat();
        float area = 4*pie*radius*radius;
        float volume = 4/3*pie*radius*radius*radius;
        System.out.println("Surface area of sphere is : " + area);
        System.out.println("Volume of sphere is : " + volume);
        return area;
    }
}

class Cylinder
{
    float cylinder()
    {
        float pie = 3.14f;
        Scanner scan = new Scanner(System.in);
        System.out.println("You choosed cylinder ");
        float height = scan.nextFloat();
        System.out.print("Enter the radius of the cylinder");
        float radius = scan.nextFloat();
        float area = 2*pie*radius*(radius+height);
        float volume = pie*radius*radius*height;
        float curvedsurfacearea = 2*pie*radius*height;
        System.out.println("Total surface area of cylinder is : " + area);
        System.out.println("Volume of cylinder is : " + volume);
        System.out.println("Curved surface area of cylinder is : " + curvedsurfacearea );
        return area;
    }
}


class Cone
{
    float cone()
    {
        float pie = 3.14f;
        Scanner scan = new Scanner(System.in);
        System.out.println("You choosed cone ");
        System.out.print("Enter the radius of cone : ");
        float radius = scan.nextFloat();
        System.out.print("Enter the length of the cone : " );
        float length = scan.nextFloat();
        float area = pie*radius*(radius+length);
        float curvedsurfacearea = pie*radius*length;
        float volume = 4/3*pie*radius*radius*radius;
        System.out.println("Total surface area of cone is : " + area);
        System.out.println("Curved surface area of cone is : " + curvedsurfacearea);
        System.out.println("Volume of cone is : " + volume );
        return area;

    }
}*/




