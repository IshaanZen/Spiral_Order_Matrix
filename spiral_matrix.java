
// Q2 ) Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners] 
// ASKED IN GOOGLE INTERVIEW

// what is spiral martix ? - representation of a matrix in spiral form eg : 

// 1 2 3        this is a normal matrix but spiral matrix will mean 
// 4 5 6         is to be represented as SPIRAL MATRIX  : 1 2 3 6 9 8 7 4 5  
// 7 8 9 

// APPROACH TO SOLVE THIS PROBLEM :->

                                                    // 1. We will need 4 variables:
                                                    // a. row_start - initialized with 0.
                                                    // b. row_end - initialized with n-1.
                                                    // c. column_start - initialized with 0.
                                                    // d. column_end - initialized with m-1.
                                                    // 2. First of all, we will traverse in the row row_start from column_start
                                                    // to column_end and we will increase the row_start with 1 as we have
                                                    // traversed the starting row.
                                                    // 3. Then we will traverse in the column column_end from row_start to
                                                    // row_end and decrease the column_end by 1.
                                                    // 4. Then we will traverse in the row row_end from column_end to
                                                    // column_start and decrease the row_end by 1.
                                                    // 5. Then we will traverse in the column column_start from row_end to
                                                    // row_start and increase the column_start by 1.
                                                    // 6. We will do the above steps from 2 to 5 until row_start <= row_end
                                                    // and column_start <= column_end.

// NOW LETS CODE : 

import java.util.*;

public class spiral_matrix{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter Number of columns : ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        // Input int the array
        for(int i =0 ; i<row ; i++){

            System.out.print("Enter elements in the array : ");
            for(int j = 0 ; j<col ; j++ ){

                arr[i][j] = sc.nextInt();    
            }
        }

        // now lets define some variables that will tell us the row-end , row-start , col-start , col-end

        System.out.print("THE ORDER OF SPIRAL MATRIX IS : ");
        
        int rowstart = 0;
        int row_end = (row-1);
        int colstart = 0 ; 
        int col_end = (col-1);

        //TO print the spiral matrix 

        while(rowstart <= row_end && colstart <= col_end){
            // 1) start from row 0 till col-end
            
            for(int coltrav=colstart ; coltrav<=col_end ; coltrav++){ //coltrav is defined as colstart and it will execute till it become equal to col_end
                System.out.print(arr[rowstart][coltrav] + " ");
            }
            rowstart ++;  //we increased the row because now we dont need to traverse through row 1 again


            // 2) start from col_end to row_end in vertical direction i.e traversing through the last line of the matrix

            for(int rowtrav=rowstart ; rowtrav<=row_end ; rowtrav++){
                System.out.print(arr[rowtrav][col_end] + " ");
            }
            col_end--;


            //3) Now traversing throw the bottom line of thee matrix from Col_end To colStart 
            //coltrav is defined as colstart and it will execute till it become equal to col_end
            
            for(int coltrav=col_end ; coltrav>=colstart ; coltrav--){ 
                System.out.print(arr[row_end][coltrav] + " ");
            }
            row_end--;
            
            //3) Now traversing throw the bottom line of thee matrix from Col_end To colStart 
            for(int rowtrav=row_end ; rowtrav>=rowstart ; rowtrav--){ //coltrav is defined as colstart and it will execute till it become equal to col_end
                System.out.print(arr[rowtrav][colstart] + " ");
            }
            colstart++;

        }

    }

}

