public class Inversions {
    public static long count(int[] a) {
    long result = 0;
    int n = a.length;
    int[] copy = new int[n];
    System.arraycopy(a, 0, copy, 0, n); // Create a copy of the input array
    
    for (int i = n - 1; i >= 0; i--) {
        boolean found = false;
        if (copy[i] != i) {
            for (int j = 0; j < i; j++) {
                if (copy[j] == i) {
                    found = true;
                    result += i - j;
                }

                if (found) {
                    copy[j] = copy[j + 1];
                }
            }
            copy[i] = i;
        }
    }
    return result;
}

    public static int[] generate(int n, long k) {
        int[] result = new int[n];
        if (k == 0)
        {
            for (int i = 0; i < n; i++)
            {
                result[i] = i;
            }
            return result;
        }
        
        int left = 0, right = 0, rr = n - 1, order = n - 1;
        while (k != 0 || order > -1)
        {
            if (k >= order)
            {
                k = k - order;
                result[left] = rr;
                rr--;
            }
            else
            {
                result[left] = right;
                right++;
            }
            order--;
            left++;
        }
        return result;
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        int[] permutation = generate(n, k);
        for (int num : permutation) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}