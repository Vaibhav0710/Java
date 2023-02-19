public class Arrays2 {
    /*
     * Best time to Buy and sell Stocks
     */
    public static int BuyandSell(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    /*
     * Trapping water
     */
    public static int TrappedRainwater(int Height[]) {
        int n = Height.length;
        // calculate Left boundary - array
        int LeftMax[] = new int[n];
        LeftMax[0] = Height[0];
        for (int i = 1; i < n; i++) {
            LeftMax[i] = Math.max(Height[i], LeftMax[i - 1]);
        }
        // calculate Right boundary - array
        int RightMax[] = new int[n];
        RightMax[n - 1] = Height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RightMax[i] = Math.max(Height[i], RightMax[i + 1]);
        }
        int TrappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // Waterlevel = min(leftmax, rightmax)
            int Waterlevel = Math.min(LeftMax[i], RightMax[i]);
            // trapped water = water level - height[i]
            TrappedWater += Waterlevel - Height[i];
        }
        return TrappedWater;
    }

    /*
     * Max Subarrays Sum(Kadane's algorithm)
     */
    public static void Printsumofsubarray3(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            currSum = currSum + num[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Sum(Kadane's algorithm): " + maxSum);
    }

    /*
     * Max Subarrays Sum(Prefix Sum)
     */
    public static void Printsumofsubarray2(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum(Prefix Sum): " + maxSum);
    }

    /*
     * Max Subarrays Sum(Brute Force)
     */
    public static void Printsumofsubarray1(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = 0;
                for (int z = start; z <= end; z++) {
                    currSum += num[z];
                }
                System.out.println("Current Sum: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum(Brute Force): " + maxSum);
    }

    /*
     * Printing sub arrays(continuous)
     */
    public static void SubArray(int num[]) {
        int ts = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int z = start; z <= end; z++) {
                    System.out.print(num[z] + " ");
                }
                ts++;
                System.out.println(" ");
            }
            System.out.println(" ");
        }
        System.out.println("Total subarrays: " + ts);
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        /*
         * Printing sub arrays(continuous)
         */
        System.out.println("Printing sub arrays(continuous): ");
        SubArray(num);
        /*
         * Max Subarrays Sum(Brute Force)
         */
        Printsumofsubarray1(num);
        /*
         * Max Subarrays Sum(Prefix Sum)
         */
        Printsumofsubarray2(num);
        /*
         * Max Subarrays Sum(Kadane's algorithm)
         */
        Printsumofsubarray3(num);
        /*
         * Trapping water
         */
        int Height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Total TrappedRainwater : " + TrappedRainwater(Height));
        /*
         * Best time to Buy and sell Stocks
         */
        System.out.print("Best time to Buy and sell Stocks ");
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Max Profit: " + BuyandSell(prices));
    }
}
