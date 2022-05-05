import java.util.*;
import java.lang.*;

//입력 : 2^5 ~ 2^20승까지 메소드 출력 정렬 데이터/랜덤 데이터/역 데이터
//메소드:정렬 , 수행시간 계산
//출력 : 수행 시간

public class Quick_Sort {
    //1.정렬, 2.랜덤, 3.역 데이터 정렬 수행시간 출력
    public static void main(String[] args) throws java.lang.Exception {
        int[] arr = new int[16];
        arr[0] = 32;
        for (int i = 0; i < 15; i++) {
            arr[i + 1] = arr[i] * 2;
        }
        //정방향 데이터
        System.out.printf("정렬전 : ");
        for (int i : arr){System.out.printf(String.valueOf(i)+",");}
        long startTime1 = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        long endTime1 = System.nanoTime();
        System.out.println(String.format("정렬 데이터 정렬 알고리즘실행 시간: %20dms", endTime1 - startTime1));
        //랜덤 데이터
        shuffle(arr);
        System.out.printf("정렬전 : ");
        for (int i : arr){System.out.printf(String.valueOf(i)+",");}
        long startTime2 = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        long endTime2 = System.nanoTime();
        System.out.println(String.format("랜덤 데이터 정렬 알고리즘실행 시간: %20dms", endTime2 - startTime2));
        //역방향 데이터
        reverse(arr);
        System.out.printf("정렬전 : ");
        for (int i : arr){System.out.printf(String.valueOf(i)+",");}
        long startTime3 = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        long endTime3 = System.nanoTime();
        System.out.println(String.format("역 데이터 정렬 알고리즘실행 시간: %20dms", endTime3 - startTime3));
        System.out.printf("정렬후 : ");
        for (int i : arr){System.out.printf(String.valueOf(i)+",");}
        System.out.println("\n");
    }
    //데이터-> 정렬 -> 정렬된 데이터

    public static int[] shuffle(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            int i = (int) (Math.random() * arr.length);
            int j = (int) (Math.random() * arr.length);

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) { //내림차순
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void quickSort(int[] arr, int left, int right) {
        int i, j, pivot, tmp;
        if (left < right) {
            i = left;
            j = right;
            pivot = arr[(left + right) / 2];
            //분할 과정
            while (i < j) {
                while (arr[j] > pivot) j--;
                // 이 부분에서 arr[j-1]에 접근해서 익셉션 발생가능함.
                while (i < j && arr[i] < pivot) i++;

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            //정렬 과정
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }

}


