public class Dupli_Numbers
{
    public static void main(String[] args) {

        int[] array= {5,6,3,9,2,9,4,3};

        for (int i=0; i<array.length-1; i++)  // stick with one element
        {
            for (int j= i+1; j<=array.length-1; j++) // traverse with all elements
            {
                if ( array[i] == array[j] )  //find duplicate
                {
                    System.out.println("Occur" + array[i]);
                }
                if (i==j)
                {
                    System.out.print( array[i] + " ");
                }

            }

        }
    }

}
