public class EnhancedSelectioNSort 
{
    public static void main(String[] args) 
    {
        int [] numbers = {6,10,2,1,12,15};
        int size = numbers.length;
        boolean swapped;
        int temp;

        System.out.println("Before Sorting ");
        for(int nums: numbers)
        {
            System.out.print(nums + " ");
        }

            for(int i =0; i <size;i++)
            {
                
                swapped = false;

                for(int j = 0; j<size - 1-i;j++)
                {
                    if(numbers[j] > numbers[j+1])
                    {
                        temp = numbers[j];
                        numbers[j] = numbers[j+1];
                        numbers[j+1] = temp;

                        swapped = true;
                       
                    }
                }
                    
                    System.out.println();
                    System.out.println("After iteration " + (i + " "));
                    for(int nums : numbers)
                    {
                        System.out.print(nums + " ");
                    }
                    
                    if(!swapped)
                    {
                        break;
                    }
            }

        System.out.println();
        System.out.println("After Sorting ");
        for(int nums: numbers)
        {
            System.out.print(nums + " ");
        }
    }
}
