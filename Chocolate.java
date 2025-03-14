public class Chocolate {

    static boolean isDivisionPossible(int[] a, int m, int maxChocolate) {

        int numOfStu = 1;
        int chocolate = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxChocolate) return false;
            if (chocolate + a[i] <= maxChocolate) {
                chocolate += a[i];
            } else {
                numOfStu++;
                chocolate = a[i];
            }
        }
        return numOfStu <= m;
    }

    static int distributeChocolate(int[] a, int m) {

        if (a.length < m) return -1;

        int st = 0;
        int end = 0;
        for (int num : a) {
            st = Math.max(st, num); // the maximum element in the array
            end += num;             // the sum of all elements in the array
        }

        int ans = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isDivisionPossible(a, m, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {12, 34, 67, 90};
        int m = 2;
        int result = distributeChocolate(a, m);
        System.out.println("Minimum possible maximum chocolates per student: " + result);
    }
}
