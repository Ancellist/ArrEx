import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ex5();
    }

    public static void ex1(){
        int num = 2;
        int[] arr = new int[10];
        for (int i = 0;i< arr.length;i++){
            arr[i] = num;
            num += 2;
        }

        for (int num1: arr){
            System.out.print(num1 + " ");
        }

        System.out.println();

        for (int num1: arr){
            System.out.println(num1);
        }

    }
    public static void ex2(){
        int[] arr = new int[50];
        int num = 1;
        for (int i = 0;i< arr.length;i++){
            arr[i] = num;
            num += 2;
        }

        for (int num1 : arr){
            System.out.print(num1 + " ");
        }

        System.out.println();

        for (int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void ex3(){
        int[] arr = new int[8];
        Random random = new Random();
        for (int i = 0;i< arr.length;i++){
            arr[i]= random.nextInt(1,10);
        }

        for (int num1:arr){
            System.out.print(num1 + " ");
        }

        for (int i = 0;i< arr.length;i++){
            if(i%2 !=0)arr[i]=0;
        }

        System.out.println();

        for (int num1:arr){
            System.out.print(num1 + " ");
        }

    }
    public static void ex4(){
        int[] arr0 = new int[5];
        int[] arr1 = new int[5];
        int sum0 = 0;
        int sum1 = 0;
        Random random = new Random();
        for (int i=0;i<arr1.length;i++){
            arr0[i]= random.nextInt(0,5);
            arr1[i]= random.nextInt(0,5);
        }
        for (int num1:arr0){
            System.out.print(num1 +" ");
        }
        System.out.println();
        for (int num1:arr1){
            System.out.print(num1 +" ");
        }
        for (int i=0;i<arr1.length;i++){
            sum0 += arr0[i];
            sum1 += arr1[i];
        }

        if (sum1 > sum0){
            System.out.println("Второй массив больше");
        }else if (sum0>sum1) {
            System.out.println("Первый массив больше");
        }else {
            System.out.println("равны");
    }
    }
    public static void ex5(){
        int[] arr = new int[4];
        int count = 0;
        Random random = new Random();
        for (int i=0;i<arr.length;i++){
            arr[i]= random.nextInt(10,99);
        }
        for (int num:arr){
            System.out.print(num + " ");
        }
        for (int i =0;i< arr.length-1;i++){
            if (arr[i] < arr[i+1]) count++;
        }

        if (count == arr.length-1) System.out.println("Массив возрастающий");

    }
}