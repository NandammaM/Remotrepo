package Task7;

public class Sub_array_sum 
{
	void subArraySum(int arr[], int n, int sum)
    {
        int currentSum, i, j;
 
        
        for (i = 0; i < n; i++) {
            currentSum = arr[i];
 
           
            for (j = i + 1; j <= n; j++) {
                if (currentSum == sum) {
                    int p = j - 1;
                    System.out.println(
                        "Sum found between indexes " + i
                        + " and " + p);
                    return;
                }
                if (currentSum > sum || j == n)
                    break;
                currentSum = currentSum + arr[j];
            }
        }
 
        System.out.println("No subarray found");
        return;
    }
 
    public static void main(String[] args)
    {
        Sub_array_sum arraysum = new Sub_array_sum();
        int arr[] = { 3,8,71,80,2,7,5,11,76 };
        int n = arr.length;
        int sum = 23;
        arraysum.subArraySum(arr, n, sum);
    }
}
