package Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class Doc_so_thanh_chu {
    final static String[] ONES = {" "," ONE"," TWO"," THREE"," FOUR"," FIVE"," SIX"," SEVEN"," EIGHT"," NINE"," TEN",
                                " ELEVEN"," TWELVE"," THIRTEEN"," FOURTEEN"," FIFTEEN"," SIXTEEN", "SEVENTEEN"," EIGHTEEN"," NINETEEN"};
    final static String[] TENS = {" ", " ", " TWENTY"," THIRTY"," FOURTY"," FIFTY"," SIXTY"," SEVENTY"," EIGHTY"," NINETY"};
    public static  void ReadNumber(int num, String value){
        System.out.print(num > 19 ? TENS[num / 10] + "" + ONES[num % 10] : ONES[num]);
        System.out.print(num > 0 ? value : "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ReadNumber(((num / 100))," HUNDRED AND");
        ReadNumber(num%100, "");
    }
}

