package Lac17;
import java.util.*;
public class workextra {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the siz of Diamond :");
            int size = in.nextInt();   	// for size of diamond
            System.out.print("Enter the nu diamond :");
            int Nu_Diamond = in.nextInt();  	// nu of diamond is to be printed
            while (Nu_Diamond-->0){		// loop for nu of diamond to be printed
                int n =(size+1)/2;
                int row = 1;			// nu of rows
                int nsp = (n-1);		// nu of spaces to be leave
                int nst =1;				// nu of stars is to be printed
                while (row<=size){		// loop for rows
                    int csp = 1;		// nu iterable spaces
                    while(csp<=nsp){	// loop for spaces
                        System.out.print("   ");
                        csp++;
                    }
                    int cst = 1; 		// variable for count of print
                    int val =1;			// variable for count
                    while (cst<=nst){		// loop for value print
                        if(val<=9) {
                            System.out.print(" "+val + " ");
                        }
                        else
                            System.out.print(val + " ");

                        if (cst<=nst/2)
                            val+=2;
                        else
                            val-=2;
                        cst	++;
                    }
                    if (row<n){			// till nu of rows is less then half
                        nsp--;
                        nst+=2;
                    }
                    else{
                        nsp++;
                        nst-=2;
                    }
                    row++;
                    System.out.println(); 		// for row change
                }
                System.out.println();
            }

        }
    }

