//Sarah is organizing her bookshelf. She has a collection of books of different sizes that 
//she wants to arrange in ascending order based on their heights using the bubble sort algorithm. 
//Initially, her books are arranged randomly. After each pass of the bubble sort algorithm, 
//she writes down the order of books from left to right. If she starts with the following arrangement of books (heights in inches


// this would be O(n^2)
public class SarahBooks 
{
    public static void main(String [] args)
    {
        int [] books = {10,5,8,3,6};
        int bookSize = books.length;
        int temp;

        System.out.println("Before Sorting");
        for(int num:books)
        {
            System.out.print(num + " ");
        }

            for(int i =0; i < bookSize; i++)
            {
                for(int j = 0; j <bookSize -1; j++)
                {
                    if(books[j] > books[j+1])
                    {
                        temp = books[j];
                        books[j] = books[j+1];
                        books[j+1] = temp;
                    }
                }
            }


            System.out.println();
        System.out.println("After  Sorting");
        for(int num:books)
        {
            System.out.print(num + " ");
        
        }
    }
}
