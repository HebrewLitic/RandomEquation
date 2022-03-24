import java.util.Scanner;
import java.lang.reflect.Method;
import java.util.Random;


class Main {
    public static void main(String[] args) {


    
        //Two random numbers
        Random opRand = new Random();
        //Instance of Scanner Class for user input
        Scanner scanner = new Scanner(System.in);


        //Random numbers between 0 and 100.
        int number1 = opRand.nextInt(100);
        int number2 = opRand.nextInt(100);
        int value = 0;
        char operator = '?';
        

        //Switch Stuff
        switch (opRand.nextInt(4)) {
            case 0: 
                operator = '+';
                value = number1+number2;
                break;
            case 1: 
                operator = '-';
                value = number1-number2;
                break;
            case 2: 
                operator = '*';
                value = number1*number2;
                break;
            case 3: 
                operator = '/';
                value = number1/number2;
                break;
            default:
                operator = '?';
            }

        
        
    
        //Solve this equation.
        System.out.print("Solve this Equation: ");
        System.out.print(number1);
        System.out.print(" ");
        System.out.print(operator);
        System.out.print(" ");
        System.out.println(number2);
    
            
            
        //Your answer
        System.out.print("Type Answer here: ");
        //your input
        int scan = scanner.nextInt();

        //if the answer is the same as the value (Number + operation + number)
        if (scan == value) {
            System.out.println("Correct!");
        }
        if (scan != value) {
            System.out.println("Incorrect. Correct answer is " + value);
        }
                   
        
        
        //New equation when Scan == value statement when you get a correct answer.
        do {
        
            number1 = opRand.nextInt(100);
            number2 = opRand.nextInt(100);
            char operator2 = '?';

            //types of operators
            switch (opRand.nextInt(4)) {
                case 0: 
                    operator2 = '+';
                    value = number1+number2;                        
                break;
                case 1: 
                    operator2 = '-';
                    value = number1-number2;
                break;
                case 2: 
                    operator2 = '*';
                    value = number1*number2;                        
                break;
                case 3: 
                    operator2 = '/';
                    value = number1/number2;
                break;
                default:
                    operator2 = '?';
                }

                    
                
                
                //Provides another equation
                System.out.print("Solve this Equation: ");                    
                System.out.print(number1);
                System.out.print(" ");
                System.out.print(operator2);
                System.out.print(" ");
                System.out.println(number2);
                
                //Your answer
                System.out.print("Type Answer here: ");
                int scan1 = scanner.nextInt();

                //Your input updates the previous input.
                scan = scan1;
                    

                //If the answer is correct
                if (scan == value) {
                    System.out.println("Correct!");
                } 

                //if the input is not the same as the value, incorrect
                if (scan != value) {
                    System.out.println("Sorry! Wrong answer. Correct answer: " + value);
            }
                    
        } while(scan == value);
        
    } 
} 
 