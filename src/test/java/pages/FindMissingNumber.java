package pages;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,5,6,7,8,9};
        int sum = 0;
        int sum2 = 0;

        //Add total sum of all numbers in the array
        for(int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("total sum is: " + sum);

        //Add total sum of all number in the 'range' of the array
        for(int j = 1; j<=9; j++){
            sum2 = sum2 + j;
        }
        System.out.println("total sum of all numbers in the range are: " + sum2);
        System.out.println("The missing number is: " + (sum2 - sum));
    }
}
