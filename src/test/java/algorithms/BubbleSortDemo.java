package algorithms;

public class BubbleSortDemo {
    public static void main(String[] args) {

        int[] myNumberArray = {20, 36, -15, 7, 55, 1, 22};

        for(int lastUnsortedIndex = myNumberArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(myNumberArray[i] < myNumberArray[i + 1]) {
                    swap(myNumberArray, i, i+1 );
                }
            }
        }

        for(int i = 0; i < myNumberArray.length; i++ ) {
            System.out.println(myNumberArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
