package academy.learnProgramming;

/**
 * Created by balajakka on 08/10/2018.
 */
public class DeclaringAndInitializingVariables {
    public static void main(String[] args) {

        //Declaring and Initializing in 2 lines

        int myNumber;//Declaration

        System.out.println("My Number is"+myNumber);
        myNumber = 10; //initialization

        System.out.println("My Number ="+myNumber);

       //Declaring and Initializing in 1 line

        double myDouble = 7.50;

        System.out.println("My Double is ="+ myDouble);

        //Declaring multiple variables in 1 one
        float myFloat1,myFloat2,myFloat3;

        float myFloat4; float myFloat5; //This is also allowed

        double myDouble1, double myDouble2; //Doesn't comple

        int int1, int2;

        //int int3, int int4; //Doesn't compile

        //int int = 10; //doesn't compile : don't use keywords

        char Char;
        char cHar;
        char CHar; //They are all different as Java identifiers are case sentitive

        double $double1;
        double _double2;
        //double 1double3;
        //double double@4;

        //double double*5;


    }
}
