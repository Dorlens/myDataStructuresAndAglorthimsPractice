class EnhancedBubblESort
{
    public static void main(String[] args) 
    {
        int [] numberOfNum = {5,10,3,12,15};
        int size = numberOfNum.length;
        boolean swapped;
        int temp;
        
        System.out.println("Before Sorting");
        for(int num:numberOfNum)
        {
            System.out.print(num + " ");
            
        }
    

            for(int i= 0; i<size; i++)
            {
                swapped = false;
                
                for(int j = 0; j< size -1-i; j++)
                {
                    if(numberOfNum[j+1] < numberOfNum[j])
                    {
                        temp = numberOfNum[j];
                        numberOfNum[j]= numberOfNum[j+1];
                        numberOfNum[j+1] = temp;
                        swapped = true;
                        
                        
                    }
                    
                    
                }
                    System.out.println();
                    System.out.print("After Iteration " + (i + 1) + ": ");
                    for (int num : numberOfNum) 
                    {
                    System.out.print(num + " ");
                    }


                    System.out.println();
                    if(!swapped) break;

               
            } 


        System.out.println();
        System.out.print("After Sorting");
        System.out.println();
        for(int num:numberOfNum)
        {
            System.out.print(num + " ");
        }
    }
}