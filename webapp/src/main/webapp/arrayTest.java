package src.main.webapp;

public class arrayTest {
    public static void main(String[] args) {
        int[] data = {90, 70, 50, 80, 60, 85};
        System.out.println("Origin Array： ");
        //print Origin Array
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("\n");

        //Add the data 75 into the last one of the array
        data = add(data, 75);
        //print Added Array
        System.out.println("Added Array： ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.print("\n");

        //Insert the data 90 into the index 2 of the array
        data = insert(data, 90,2);
        //print Inserted Array
        System.out.println("Inserted Array： ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.print("\n");

        //Update the data 75 instead of the data where was on the index 2
        data = update(data, 80,2);
        //print Updated Array
        System.out.println("Updated Array： ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.print("\n");

        //Delete the data where was on the index 2
        data = delete(data, 2);
        //print Deleted Array
        System.out.println("Deleted Array： ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.print("\n");
    }

    //Add  data  into the array
    public static int[] add(int[] array, int score) {
        int[] tempArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
        tempArray[array.length] = score;

        return tempArray;
    }

    //Insert data into the array
    public static int[] insert(int[] array, int score,int insertIndex) {

        int[] tempArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if(i<insertIndex)
            {
                tempArray[i] = array[i];
            }
            else
            {
                tempArray[i+1] = array[i];
            }
        }
        tempArray[insertIndex] = score;

        return tempArray;
    }

    //update data into the array
    public static int[] update(int[] array, int score,int replaceIndex) {

        array[replaceIndex] = score;

        return array;
    }

    //Delete data into the array
    public static int[] delete(int[] array,int deleteIndex) {

        int[] tempArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if(i<=deleteIndex)
            {
                tempArray[i] = array[i];
            }
            else
            {
                tempArray[i-1] = array[i];
            }
        }

        return tempArray;
    }


}
