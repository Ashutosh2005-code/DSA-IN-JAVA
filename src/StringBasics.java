public class StringBasics {

    static void printString(String str4){
        int n = str4.length();
        for (int i = 0; i < n; i++) {
            char ch = str4.charAt(i);
            System.out.println(ch);
        }
    }

    static int gettingLengthOfString(String str) {
        char[] charArray = str.toCharArray();
        int len = charArray.length;
        return len;
    }
    static void main() {
        String str4 = "ASHUTOSH";
        printString(str4);


        String str = "Acharya";
        System.out.println("The Length Of the String is: " + gettingLengthOfString(str));






//        Scanner sc = new Scanner(System.in);
//        String str = "Ashu";
//        String str1 = new String("Ashutosh");
//
//        System.out.println(str + " " + str1);
//
//        System.out.println(str.length());
//
//        System.out.println(str.charAt(0));
//
//        //string is immutable :- can't be updated.
//
//        String name1 = "Ashu";
//        String name2 = "Ashu";
//
//        if (name1.equals(name2)) {
//            System.out.println("Strings are the same");
//
//
//        }
//        else{
//            System.out.println("Strings are not the same");
//        };
//
//        //.equalsIgnoreCase() :-> ignores the Case Sensitivity:
//
//        //String Input:
//        System.out.println("Give The String Content:" );
//        String str2 = sc.nextLine();//MY NAME IS ASHU :-PURA PRINT HOGA.
//        System.out.println(str2);
//        System.out.println("enter:");
//        String str3 = sc.next();//MY PRINT HO BS :- 1ST WORD ONLY.
//        System.out.println("Given The String Content:" + str3);
//









        


    }
}
