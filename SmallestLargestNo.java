public class SmallestLargestNo {
 
        public static void main(String[] args) {
                int num[] = new int[]{32,44,66,66,88,9,1,5};
                int smallNo = num[0];
                int largeNo = num[0];
               
                for(int i=1; i< num.length; i++)
                {
                       if (num[i] < smallNo)
                                smallNo = num[i];
                        else if(num[i] > largeNo)
                                largeNo = num[i];

                       
                }
                   System.out.println("Smallest Number is : " + smallNo);
                System.out.println("Largest Number is : " + largeNo);
                int temp;
                for (int i = 1; i < num.length; i++) {
                 for (int j = i; j > 0; j--) {
                  if (num[j] < num [j - 1]) {
                   temp = num[j];
                   num[j] = num[j - 1];
                   num[j - 1] = temp;
                  }
                 }
                }
                System.out.println("Array in sorted form is:");
                for (int i = 0; i < num.length; i++) {
                  System.out.println(num[i]);
                }
        }
}