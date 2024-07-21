public class DoingBubbleSort
{
    public static void main(String[] args)
    {
        int [] numberOfNum ={4,9,2,6,7,1,12,23,5,17};
        int size = numberOfNum.length;
        int temp = 0;

        System.out.println("Before Sorted");
        for(int num: numberOfNum)
        {
            System.out.print(num + " ");
        }

            for(int i =0; i<size; i++)
            {
                for(int j = 0; j < size - 1; j++)
                {
                    if(numberOfNum[j] > numberOfNum[j+1])
                    {
                        temp = numberOfNum[j];
                        numberOfNum[j] = numberOfNum[j+1];
                        numberOfNum[j+1] = temp;
                    }
                    System.out.println();
                    System.out.print("After Iteration " + (i + 1) + ": ");
                    for (int num : numberOfNum) 
                    {
                    System.out.print(num + " ");
                    }
                }

            }
        System.out.println();
        System.out.println("After Sorted");
        for(int num: numberOfNum)
        {
            System.out.print(num + " ");
        }
    }
}
