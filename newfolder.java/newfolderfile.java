class newfolderfile {
    public static void main(String[] args) {
        int a = 40;
        int b = 25;
        System.out.println(a + b);

        int nums[] = { 54312121, 98144765, 12351245, 67821290, 13221579, 2461480, 8642120, 4206229, 54321, 98765, 12345,
                67890, 13579, 24680, 86420, 42069, 31415, 27182 };
        int target = 42069;
        // int nums[] = new int[100];
        // int target = 25;

        // linearSearch
        int result = linearSearch(nums, target);
        if (result != 1) {
            System.out.println("Element found at Index : " + result);
        } else {
            System.out.println("Element not found");
        }

        // // BinarySearch
        int result2 = binarySearch(nums, target);
        if (result2 != 1) {
            System.out.println("Element found at Index : " + result2);
        } else {
            System.out.println("Element not found");
        }

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.println(num);
        }

        // BubbleSort
        int size = nums.length;
        int temp = 0;
        int steps = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                steps++;
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    System.out.println("Steps taken by the Bubble Sort " + steps);
                }
            }
        }

        System.out.println();
        System.out.println("after sorting");
        for (int num : nums) {
            System.out.println(num);
        }
    }

    // linearSearch
    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by the linear Search " + steps);
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int steps = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                System.out.println("Steps taken by the binary Search " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Steps taken by the binary Search " + steps);
        return -1;
    }
}
