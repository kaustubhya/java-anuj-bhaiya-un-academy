import java.util.Arrays;
// import java.util.Scanner;

public class java_basics2 {
    public static void main(String[] args) {
        // int ageList[] = new int[5];
        // ageList[0] = 12;
        // ageList[1] = 78;
        // ageList[2] = 20;
        // ageList[3] = 2;
        // ageList[4] = 456;
        
        // System.out.println(ageList[3]);

        // Arrays + loops

    //     int ageList[] = new int[5];
    //     Scanner sc = new Scanner(System.in);

    //      System.out.println("Please enter the ages: ");

    //     for(int i = 0; i < 5; i++){
    //         ageList[i] = sc.nextInt();
    //     }

    //     for(int i = 0; i < 5; i++){
    //         System.out.println("The age of roll no. " + (i+1) + " is " + ageList[i]);
    //     }

    // //    Scanner sc = new Scanner(System.in);
    // //    System.out.println("Enter Here: ");
    // //    int a = sc.nextInt();
    // //    System.out.println("You entered the number " + a);

    // // For each loop, used to go through all elemrnts in an array
    // for(int element: ageList)
    // {
    //     System.out.println(element);
    // }
    // System.out.println(Arrays.toString(ageList));

    int[][][] a12 = {
        {{2,1,3}, {1,7,6}},
        {{3,2,1}, {7,3,5}}
    };

// Using deepToString for multidimentional arrays
    System.out.println(Arrays.deepToString(a12));




    }
    
}
