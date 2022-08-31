public class notes1 {
    public static void main(String[] args) {
     //   8/22/2022

      //  Arrays
        //  -> list of elements of the same type
        //  int[] arrayOfInt = new int[10]; -all ints are going to be 0s
        //  arrayOfInt[0] = 2;
        //  arrayOfInt[9] =  arrayOfInt[0]+1;
        //  arrayOfInt[8] = arrayOfInt[arrayOfInt.length-1];
---------------------------------------------------------------------------------------------------
        int[] arrayOfInt = new int[3];

        int sum = 0;
        int average = 0;
        for(i = 0; i < arrayOfInt.length; i++){
            sum = sum + arrayOfInt[i];

        }
        average = sum/arrayOfInt.length;
        System.out.print(average);
------------------------------------------------------------------------------------------------------
     //   Loops
     //   -for loop
        //   While loop
        //   Do-while loop
        //   For each

//<return type> <function name> (<argument type> <argument name> )
-----------------------------------------------------------------------------------------------------
     //   8/29/2022
    //    Multidimensional arrays
//-> arrays of arrays
       //         -> declare: int[][] table = new int[<# of row> ] [<# of column> ]; //2d array
      //  <side = rows>	      row, colum
        int [] [] table new int[2][2];
       table [0][0] = 100;
//“” [0][1] = 200;
//“” [1][0] = 300;
//“” [1][1] = 400;
      //  Array size is fixed. But can reassign values in the array.
       // 1st sqr brkt is the rows
      //  2nd sqr brkt is the columns
        int max= table[0][0];
        int sum= 0;
        for(int i = 0; i< table.length; i++) {
            for ( int j =0; j < table.length;j++){
                sum+= table [i][j];
                if(table[i][j] > max){
                    max = table[i][j];
                }//if


            }//for2

        }//for1
        sys.out("max..." + max + sum);
---------------------------------------------------------------------------------------------------

      //  Objects and classes
       // Class

      //  A class defines a type of object
      //          Objects are variables? (He says not to tell anyone)
    //    Class (keyword)
    //    Data fields (AKA attributes) are the characteristics that all objects of this will have.
-------------------------------------------------------------------------------------------------------
        class Marker {
            //need to define the attributes/properties/Data fields of the class
            String color; //is an attribute..etc
            String brand; //is an attribute..etc
            int inkLevel; //is an attribute..etc
        } //end class //declared class

//To use the Marker class, you type in the code:
        class Program{

            public static void main(String[] argos){

                Marker blackMarker = new Marker();
//declared object | //instantiating the object
            //    blackMarker.color = "Black";

           //     system.out.print(blackMarker.color); // console: Black
            //    blackMarker.inkLevel = 50;
            //    blackMarker.brand = "Expo";

            //    Marker blueMarker = new Marker(); //with any class, you can create any         amount of objects. The blueMarker variable is independent from the blackMarker variable.

            //    blueMarker.color = "Blue";
            //    System.out.print(blueMarker.color); // console: Blue
            }//end main
        }//end Program
    //    A class is a type of object.


     //   Object
      //  Is an instant of a class
      //  Real entity of a specific class type
//Independent from each other/ a Program can reuse the class to create several independent objects.




    }
}
