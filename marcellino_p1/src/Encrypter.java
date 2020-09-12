public class Encrypter {

    static String encrypt(String number){

        int []num = new int[4];

        for(int i = 0; i < 4; i++){
            char ch = number.charAt(i);
            num[i] = Character.getNumericValue(ch);
        }

        for (int i = 0; i < 4; i++){
            int temp = num[i];
            temp += 7;
            temp = temp % 10;
            num[i] = temp;
        }
        int temp = num[0];
        num[0] = num[2];
        num[2] = temp;
        temp = num[1];
        num[1] = num[3];
        num[3] = temp;
        int newNumber = 0;
        for(int i = 0; i <4; i++){
            newNumber = newNumber * 10 + num[i];
        }
        String output = Integer.toString(newNumber);
        if(num[0] == 0)
            output = "0" + output;
        return output;
    }

} // end class Encrypter
