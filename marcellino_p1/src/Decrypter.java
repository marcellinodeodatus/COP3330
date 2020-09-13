public class Decrypter {

    public static String decrypt(String number){

        int []numberArray = convertStringToIntArray(number);
        int newNumber = calculation(numberArray);
        String finalOutput = convertIntToString(newNumber, numberArray);
        printOutput(number, finalOutput);
        return finalOutput;

    } // end method decrypt

    private static int calculation(int[] arrayOfNumber) {

        swap(arrayOfNumber);
        doTheMath(arrayOfNumber);
        return convertIntArrayToInt(arrayOfNumber);

    }

    private static int convertIntArrayToInt(int[] arrayOfNumber) {
        int c = 0;
        for(int i=0;i<4;i++)
            c = c * 10 + arrayOfNumber[i];
        return c;
    }

    public static String convertIntToString(int number, int []arrayOfNumber){
        String numberString = Integer.toString(number);
        if(arrayOfNumber[0] == 0)
            numberString = "0" + numberString;
        return numberString;
    }

    public static int [] convertStringToIntArray(String number){
        int[]arr = new int[4];
        for(int i = 0; i < 4; i++){
            char ch = number.charAt(i);
            arr[i] = Character.getNumericValue(ch);
        }
        return arr;
    }

    private static void doTheMath(int[] arrayOfNumber) {
        for(int i=0;i<4;i++) {
            int number = arrayOfNumber[i];
            switch (number) {
                case 0 -> arrayOfNumber[i] = 3;
                case 1 -> arrayOfNumber[i] = 4;
                case 2 -> arrayOfNumber[i] = 5;
                case 3 -> arrayOfNumber[i] = 6;
                case 4 -> arrayOfNumber[i] = 7;
                case 5 -> arrayOfNumber[i] = 8;
                case 6 -> arrayOfNumber[i] = 9;
                case 7 -> arrayOfNumber[i] = 0;
                case 8 -> arrayOfNumber[i] = 1;
                case 9 -> arrayOfNumber[i] = 2;
            }
        }
    }

    private static void swap(int[] numArray) {
        int temp = numArray[0];
        numArray[0]=numArray[2];
        numArray[2]=temp;
        temp = numArray[1];
        numArray[1]=numArray[3];
        numArray[3]=temp;
    }

    public static void printOutput(String num, String output) {
        System.out.println("encrypt " +num+ " to "+output);
    }

} // end class Decrypter
