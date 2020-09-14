import java.util.Scanner;

public class Medina_p1
{
    public static String encrypt(String number)
    {
        //initialize array for String
        char num;
        int i, tmp, newnum=0;
        int arr[] = new int[4];

        for(i=0; i<4; i++)
        {
            num = number.charAt(i);
            arr[i] = Character.getNumericValue(num);
        }

        for(i=0; i<4; i++)
        {
            tmp = arr[i];
            tmp += 7;
            tmp = tmp%10;
            arr[i] = tmp;
        }
        //swap first to third and and third to first
        tmp = arr[0];
        arr[0] = arr[2];
        arr[2] = tmp;
        //swap second to forth and forth to second
        tmp = arr[1];
        arr[1] = arr[3];
        arr[3] = tmp;

        for(i=0; i<4; i++)
        {
            newnum = newnum*10+arr[i];
        }
        String output = Integer.toString(newnum);
        if(arr[0] == 0)
        {
            output = 0+output;
        }

        return output;
    }

    public static String decrypt(String number)
    {
        int arr[] = new int[4];
        int i, tmp, newnum = 0, dig;
        char num;

        for(i=0; i<4; i++)
        {
            num = number.charAt(i);
            arr[i] = Character.getNumericValue(num);
        }
        //swap first to third and third to first
        tmp = arr[0];
        arr[0] = arr[2];
        arr[2] = tmp;
        //swap second to forth and forth to second
        tmp = arr[1];
        arr[1] = arr[3];
        arr[3] = tmp;
        //cases made for %remainder
        for(i=0; i<4; i++)
        {
            dig = arr[i];
            switch(dig)
            {
                case 0:
                    arr[i] = 3;
                    break;
                case 1:
                    arr[i] = 4;
                    break;
                case 2:
                    arr[i] = 5;
                    break;
                case 3:
                    arr[i] = 6;
                    break;
                case 4:
                    arr[i] = 7;
                    break;
                case 5:
                    arr[i] = 8;
                    break;
                case 6:
                    arr[i] = 9;
                    break;
                case 7:
                    arr[i] = 0;
                    break;
                case 8:
                    arr[i] = 1;
                    break;
                case 9:
                    arr[i] = 2;
                    break;


            }
        }
        for(i=0; i<4; i++)
        {
            newnum = newnum*10+arr[i];
        }
        String output = Integer.toString(newnum);
        if(arr[0] == 0)
        {
            output = "0" + output;
        }
        return output;
    }

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a 4 Digit Number:");
        String number = inp.nextLine();

        String encryptednum = encrypt(number);

        System.out.println("The Encrypted Number is:"+encryptednum);
        System.out.println("The Decrypted Number is:"+decrypt(encryptednum));
    }
}




