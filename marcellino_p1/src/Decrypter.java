public class Decrypter {

    private String output;

    public String decrypt(String number){
        int []num = new int[4];
        for(int i=0;i<4;i++) {
            char ch = number.charAt(i);
            num[i] = Character.getNumericValue(ch);
        }
        int temp = num[0];
        num[0]=num[2];
        num[2]=temp;
        temp = num[1];
        num[1]=num[3];
        num[3]=temp;
        for(int i=0;i<4;i++) {
            int digit = num[i];
            switch(digit) {
                case 0:
                    num[i] = 3;
                    break;
                case 1:
                    num[i] = 4;
                    break;
                case 2:
                    num[i] = 5;
                    break;
                case 3:
                    num[i] = 6;
                    break;
                case 4:
                    num[i] = 7;
                    break;
                case 5:
                    num[i] = 8;
                    break;
                case 6:
                    num[i] = 9;
                    break;
                case 7:
                    num[i] = 0;
                    break;
                case 8:
                    num[i] = 1;
                    break;
                case 9:
                    num[i] = 2;
                    break;
            }
        }
        int newNumber = 0 ;
        for(int i=0;i<4;i++)
            newNumber = newNumber * 10 + num[i];
        String output = Integer.toString(newNumber);
        if(num[0]==0)
            output = "0"+output;
        return output;
    }

} // end class Decrypter
