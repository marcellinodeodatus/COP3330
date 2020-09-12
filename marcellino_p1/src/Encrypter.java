
public class Encrypter {

    public static String encrypt(String number){

        int []num = convertString2IntArray(number);
        int newNumber = calculation(num);
        String output = convertInt2String(newNumber, num);
        printOutput(number, output);
        return output;
    }

    public static void printOutput(String num, String output) {
        System.out.println("encrypt " +num+ " to "+output);
    }

    public static int [] convertString2IntArray(String number){
        int[]arr = new int[4];
        for(int i = 0; i < 4; i++){
            char ch = number.charAt(i);
            arr[i] = Character.getNumericValue(ch);
        }
        return arr;
    }

    public static int calculation(int [] arrayOfNumber){
        for (int i = 0; i < 4; i++){
            int temp = arrayOfNumber[i];
            temp += 7;
            temp = temp % 10;
            arrayOfNumber[i] = temp;
        }
        int temp = arrayOfNumber[0];
        arrayOfNumber[0] = arrayOfNumber[2];
        arrayOfNumber[2] = temp;
        temp = arrayOfNumber[1];
        arrayOfNumber[1] = arrayOfNumber[3];
        arrayOfNumber[3] = temp;

        int newNumber = 0;
        for(int i = 0; i <4; i++){
            newNumber = newNumber * 10 + arrayOfNumber[i];
        }
        return newNumber;

    }

    public static String convertInt2String(int number, int []arrayOfNumber){
        String numberString = Integer.toString(number);
        if(arrayOfNumber[0] == 0)
            numberString = "0" + numberString;
        return numberString;
    }

}
