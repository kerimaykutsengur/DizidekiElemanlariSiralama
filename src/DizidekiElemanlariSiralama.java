import java.util.Scanner;
import java.util.Arrays;


public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Dizinin boyutunu giriniz :");
        n = input.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");

        int i;
        for (i = 0; i < list.length; i++) {
            System.out.print(i +1 + ". Elemanı : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sıralama :" + Arrays.toString(list));
    }



}
