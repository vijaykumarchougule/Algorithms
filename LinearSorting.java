public class LinearSorting {

    public static int search(int arr[], int a) {
        int n = arr.length;
        int x = a;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int a = 4;
        int res = search(arr, a);
        if (res == 1) {
            System.out.println("The Value found");
        } else {
            System.out.println("The Value Not found");

        }
    }
}
