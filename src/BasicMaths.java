public class BasicMaths {

    static void printDigits(int number){
        //if num = 0 , ruk jao
        //if num != 0 , chalte chalo

        while(number!=0){
            int digit = number%10;
            System.out.println(digit);
            number=number/10;

        }


    }

    static int CountDigits(int number){
        int count = 0;
        while(number!=0){
            int digit = number%10;
            count++;
            number=number/10;
        }
        return count;
    }

    static int SumOfDigits(int number){
        int sum = 0;
        while(number!=0){
            int digit = number%10;
            sum =  sum + digit;
            number=number/10;
        }
        return sum;
    }

    static int ReverseNumber(int number){
        int revNum = 0;
        while(number!=0){
            int digit = number%10;
            revNum = revNum*10+digit;
            number=number/10;
        }
        return revNum;
    }

    static boolean Palindrome(int num){
        int Orignal_Num = num;
        int Reversed_Num = ReverseNumber(num);
        if(Reversed_Num == Orignal_Num){
            System.out.println("Palindrome");
            return true;
        }
        else {
            System.out.println("Not Palindrome");
            return false;
        }

    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
                System.out.println(number +  "  " +  "Not Prime");
                return false;
            }
        }
        System.out.println(number + "   " + "is Prime Number");
        return true;

    }

    static int GettingGCD(int a,int b){
        //GCD( A , B) = GCD(B , A%B);
        while(b!=0){
            int temp = b;
            b = a%b;
            a=temp;

        }
        int gcd = a;
        return gcd;
    }

    static int GettingLCM(int a,int b){
        int gcd = GettingGCD(a,b);
        int prod = a*b;
        int lcm = prod/gcd;
        return lcm;
    }


    static boolean Armstrong(int num) {
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            int cube = digit * digit * digit;
            sum = sum + cube;

            // Remove the last digit
            num = num / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong");
            return true;
        } else {
            System.out.println("Not Armstrong");
            return false;
        }
    }



    static void main() {
        int number;
        number = 53127;

//        //printing Digits
//        printDigits(number);
//
//        //Counting Digits
//        int ans = CountDigits(number);
//        System.out.println("Total Number Of Digits Are :->"+ans);
//
//
//        //*Likhna Hai*//Sum Of Digits
//        int sum = SumOfDigits(number);
//        System.out.println("Total Sum Of Digits :->"+sum);
//
//
//        //*likhna hai*//Reverse of Given Number.
//        int REVERSE_NUMBER = ReverseNumber(number);
//        System.out.println("Reversed Number is : "+REVERSE_NUMBER);
//
//        //Palindrome or not.
//        boolean palindrome = Palindrome(186);
//        System.out.println(palindrome);

        //Prime or Not.
//        boolean isPrime = isPrime(13);
//        System.out.println(" is Prime ==" +"  "+ isPrime);
//          //find The GCD.
//        System.out.println("THE GCD IS :"+GettingGCD(18,12));
//          //LCM.
//        System.out.println("THE LCM IS :"+GettingLCM(18,12));


        //Armstrong.
        boolean isArmstrong = Armstrong(153);
        System.out.println(" Armstrong =" +"  "+ isArmstrong);

        //perfect Number .


        //1 - n tak prime number.gi
    }

}
