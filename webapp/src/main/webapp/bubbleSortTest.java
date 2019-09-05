package src.main.webapp;
public class bubbleSortTest {
    public static void main(String[]args) {
        int[] data = {6,5,9,7,2,8};
        System.out.println("Bubble Sort： ");
        System.out.println("Origin Data： ");
        //Scan Array
        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.print("\n");
        //Bubble Data
        bubbleSort(data);
    }
    public static void bubbleSort(int[]data) {
        //Use temp to exchange the array elements
        int temp;
        //Use i to record scan times
        for(int i = data.length - 1; i > 0; i--) {
            //Bubble Sort
            for(int j = 0; j < i; j++) {
                //Start from the 1st element to the next, exchange if it is bigger than the next one
                if(data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            System.out.print("" + (data.length - i) +" time(s) sort result： ");
            //print the result for this time
            for(int k = 0; k < data.length; k++) {
                System.out.print(data[k] + " ");
            }
            System.out.print("\n");
        }
    }
}

