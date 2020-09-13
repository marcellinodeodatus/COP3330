
public class Encrypter {

    public static String encrypt(String number){

        int []numberArray = convertStringToIntArray(number);
        int newNumber = calculation(numberArray);
        String finalOutput = convertIntToString(newNumber, numberArray);
        printOutput(number, finalOutput);
        return finalOutput;

    }

    public static int calculation(int [] arrayOfNumber){

        doTheMath(arrayOfNumber);
        swap(arrayOfNumber);
        return convertIntArrayToInt(arrayOfNumber);

    }

    public static int [] convertStringToIntArray(String number){
        int[]arr = new int[4];
        for(int i = 0; i < 4; i++){
            char ch = number.charAt(i);
            arr[i] = Character.getNumericValue(ch);
        }
        return arr;
    }

    private static int convertIntArrayToInt(int[] arrayOfNumber) {
        int c = 0;
        for(int i = 0; i <4; i++){
            c = c * 10 + arrayOfNumber[i];
        }
        return c;
    }

    public static String convertIntToString(int number, int []arrayOfNumber){
        String numberString = Integer.toString(number);
        if(arrayOfNumber[0] == 0)
            numberString = "0" + numberString;
        return numberString;
    }

    public static void doTheMath(int[] numArray) {
        for (int i = 0; i < 4; i++){
            int temp = numArray[i];
            temp += 7;
            temp = temp % 10;
            numArray[i] = temp;
        }
    }

    public static void printOutput(String num, String output) {
        System.out.println("encrypt " +num+ " to "+output);
    }

    public static void swap(int[] numArray) {
        int temp = numArray[0];
        numArray[0] = numArray[2];
        numArray[2] = temp;
        temp = numArray[1];
        numArray[1] = numArray[3];
        numArray[3] = temp;
    }

} // end class Encrypter
