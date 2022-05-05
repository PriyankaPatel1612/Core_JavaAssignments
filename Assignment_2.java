import java.util.Scanner;

public class Assignment_2 {



        public static void main(String[] args) throws Exception
        {

            Scanner scan = new Scanner(System.in);
            boolean flag = true;
            float pie = 3.14f;

            System.out.println("Choose the number to find the area and perimeter of any shape : ");
            System.out.println("1. Circle ");
            System.out.println("2. Rectangle ");
            System.out.println("3. Triangle");
            System.out.println("4. Square ");
            System.out.println("5. Sphere ");
            System.out.println("6. Cylinder ");
            System.out.println("7. Cone ");
            System.out.println("8. Exit ");



            while( flag == true) {
                System.out.print("Enter your Choice : ");
                int choose = scan.nextInt();

                switch (choose) {
                    case 1:
                        System.out.println("You choosed circle " );
                        System.out.print("Enter the radius : ");
                        float radius = scan.nextFloat();
                        float area = pie * radius * radius;
                        float circumference = 2*pie*radius;
                        System.out.println("Area of circle is : " + area);
                        System.out.println("Circumference of circle : "+ circumference);
                        break;

                    case 2:
                        System.out.println("You choosed rectangle " );
                        System.out.print("Enter the length of rectangle : ");
                        float length = scan.nextFloat();
                        System.out.print("Enter the breadth of rectangle : ");
                        float breadth = scan.nextFloat();
                        area = length * breadth;
                        float perimeter = 2 * (length + breadth);
                        System.out.println("Area of rectangle is : " + area);
                        System.out.println("Perimeter of rectangle is : " + perimeter);
                        break;

                    case 3:
                        System.out.println("You choosed triangle ");
                        System.out.print("Enter the breadth of triangle");
                        breadth = scan.nextFloat();
                        System.out.print("Enter the height of triangle");
                        float height = scan.nextFloat();
                        area = 1/2*breadth*height;
                        System.out.println("Area of triangle is : " + area);
                        break;

                    case 4:
                        System.out.println("You choosed square ");
                        System.out.print("Enter the side of square a : ");
                        float a = scan.nextFloat();
                        area = a*a;
                        perimeter = 4*a;
                        System.out.println("Area of square is : " + area);
                        System.out.println("Perimeter of aquare is : " + perimeter);
                        break;

                    case 5:
                        System.out.println("You choosed sphere ");
                        System.out.print("Enter the radius of sphere : ");
                        radius = scan.nextFloat();
                        area = 4*pie*radius*radius;
                        float volume = 4/3*pie*radius*radius*radius;
                        System.out.println("Surface area of sphere is : " + area);
                        System.out.println("Volume of sphere is : " + volume);
                        break;

                    case 6:
                        System.out.println("You choosed cylinder ");
                        System.out.print("Enter the height of the cylinder");
                        height = scan.nextFloat();
                        System.out.print("Enter the radius of the cylinder");
                        radius = scan.nextFloat();
                        area = 2*pie*radius*(radius+height);
                        volume = pie*radius*radius*height;
                        float curvedsurfacearea = 2*pie*radius*height;
                        System.out.println("Total surface area of cylinder is : " + area);
                        System.out.println("Vo;ume of cylinder is : " + volume);
                        System.out.println("Curved surface area of cylinder is : " + curvedsurfacearea );
                        break;

                    case 7:
                        System.out.println("You choosed cone ");
                        System.out.print("Enter the radius of cone : ");
                        radius = scan.nextFloat();
                        System.out.print("Enter the length of the cone : " );
                        length = scan.nextFloat();
                        area = pie*radius*(radius+length);
                        curvedsurfacearea = pie*radius*length;
                        volume = 4/3*pie*radius*radius*radius;
                        System.out.println("Total surface area of cone is : " + area);
                        System.out.println("Curved surface area of cone is : " + curvedsurfacearea);
                        System.out.println("Volume of cone is : " + volume );
                        break;

                    case 8:
                        System.out.println("thankyou !");
                        flag=false;
                        break;
                }
            }
        }
    }