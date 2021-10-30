/**
 * Circle
 * @author <<Erik Paak Yum Dekker>>
 * @ID <<1665049>>
 */
import java.util.InputMismatchException;
import java.util.Scanner;
class Circle {

    public void run() {
        Scanner scanner= new Scanner(System.in);
        //Array that stores all of the users inputs. 
        double[] input = new double [8]; 
		
        /**
         * This for loop iterates 8 times,
         * this is so that the user can input all the values.
        */
        for(int i = 0; i < 8; i++){
            //This "try catch" stops the code from crashing when the user inputs letter.
            try{
                input[i] = scanner.nextDouble();
            }  
                catch (InputMismatchException ex){
                System.out.println("Input Error.");
                //stops the program from running. 
                System.exit(0);
                    
            }
        /**
         * This if statement ouputs an error message if the user inputs a negative radius.
        */
            if((i==2 || i==5) && input[i] < 0){
                System.out.println("input error");
                System.exit(0);
            }
            
        }
        /**
         * This set of variables represent the users inputs in a more user friendly fashion.
        */
        double x = input[0];
        double y = input[1];
        double r = input[2];
        double x1 = input[3];
        double y1 = input[4];
        double r1 = input[5];
        double testx = input[6];
        double testy = input[7];
        //these two vatiables calculate the distance between the center of each circle and the point.
        double dis = Math.sqrt((testx - x) * (testx - x) + (testy - y) * (testy - y));
        double dis1 = Math.sqrt((testx - x1) * (testx - x1) + (testy - y1) * (testy - y1));

        /**
         * These if statements create the outputs for the programme when inputs are corrrect.
        */
        if(dis < r && dis < r1){
            System.out.println("The point lies in both circles");
        } else if(dis < r) {
            System.out.println("The point lies in the first circle");
        } else if(dis1 < r1) {
            System.out.println("The point lies in the second circle");
        } if(dis1 > r1 && dis > r) {
            System.out.println("The point does not lie in either circle");
        }
    }

    public static void main(String[] args) {
        (new Circle()).run();
    }
}
