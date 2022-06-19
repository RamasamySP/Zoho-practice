import java.util.*;
class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int price = sc.nextInt();
        int wrap = sc.nextInt();


        //No of chocolates that can be bought by using money
        int chocolate = money/price;
        //Now money becomes 0 and no of wraps available is equal to no of chocolate available now
        int wrapavail = chocolate;
        while (wrapavail >= wrap) {
            int tem = wrapavail/wrap;
            //storing remaining unexchanged wraps
            int remainder = wrapavail%wrap;
            chocolate += tem;
            wrapavail = tem + remainder;
        }
        System.out.println(chocolate);
    }
}