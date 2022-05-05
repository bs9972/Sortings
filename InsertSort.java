public class InsertSort {
    public static void main(String[] args) throws java.lang.Exception {
        int[] arr = new int[16];
        arr[0] = 32;
        for (int i = 0; i < 15; i++) {
            arr[i + 1] = arr[i] * 2;
        }
        //정방향 데이터
        System.out.printf("정렬전 : ");
        for (int i : arr) {
            System.out.printf(String.valueOf(i) + ",");
        }
        long startTime1 = System.nanoTime();
        insertionSort(arr);
        long endTime1 = System.nanoTime();
        System.out.println(String.format("정렬 데이터 정렬 알고리즘실행 시간: %20dms", endTime1 - startTime1));
        //랜덤 데이터
        shuffle(arr);
        System.out.printf("정렬전 : ");
        for (int i : arr) {
            System.out.printf(String.valueOf(i) + ",");
        }
        long startTime2 = System.nanoTime();
        insertionSort(arr);
        long endTime2 = System.nanoTime();
        System.out.println(String.format("랜덤 데이터 정렬 알고리즘실행 시간: %20dms", endTime2 - startTime2));
        //역방향 데이터
        reverse(arr);
        System.out.printf("정렬전 : ");
        for (int i : arr) {
            System.out.printf(String.valueOf(i) + ",");
        }
        long startTime3 = System.nanoTime();
        insertionSort(arr);
        long endTime3 = System.nanoTime();
        System.out.println(String.format("역 데이터 정렬 알고리즘실행 시간: %20dms", endTime3 - startTime3));
        System.out.printf("정렬후 : ");
        for (int i : arr) {
            System.out.printf(String.valueOf(i) + ",");
        }
        System.out.println("\n");
    }

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

    public static void insertionSort(int[] arr){

        for(int index = 1 ; index < arr.length ; index++){

            int temp = arr[index];
            int aux = index - 1;

            while( (aux >= 0) && ( arr[aux] > temp ) ) {

                arr[aux+1] = arr[aux];
                aux--;
            }
            arr[aux + 1] = temp;
        }
    }
}
