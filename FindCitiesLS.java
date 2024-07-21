/*You are given an array of strings containing the names of various cities. 
Your task is to write a function findCity that performs a linear search to find the position of a given city name in the array.
If the city is found, the function should return its index; otherwise, it should return -1. */

public class FindCitiesLS 
{
    public static void main(String[] args)
    {

        String [] cities = {"New York", "Los Angeles","Chicago", "Houston","Phoenix"};

           String  target = "Chicago";

            int  results = LinearSearch(cities, target );

                if(results != -1)
                {
                    System.out.println("Your Element index is : " + results);
                }
                else
                    System.out.println("No Element Found");
    }


    public static int LinearSearch(String [] cities, String target)
    {
        for(int i = 0; i<cities.length; i++)
        {

            if(cities[i].equals(target))
            return i;


        }
        return -1;

    }
}
