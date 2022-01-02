import java.util.Arrays;

public class FindMissing {
    public static void main (String[] args){
        int[] array = {10, 5, 1, 2, 4, 6, 8, 3, 9};
        missingNum(array);
    }
    public static void missingNum(int[] givenArray){
//        int missingNumber = 0;
        System.out.println(givenArray);
        Arrays.sort(givenArray);
        System.out.println(Arrays.toString(givenArray));

//int length = givenArray.length;
//        int sumAll = (length*(length+1))/2;
        int sumAll = (10*(10+1))/2;
        System.out.println("Sum of all numbers " + sumAll);

        int currentSum = 0;

//        find the summ of all numbers in the array
for(int i=0;i<givenArray.length;i++){
    currentSum += givenArray[i];
}

int missingNumber = sumAll - currentSum;

        System.out.println(missingNumber);
    }
}
