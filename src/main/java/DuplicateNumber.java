import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
    static void dup_num(int[] array1)
    {
        List<Integer> list= new ArrayList<Integer>();

        for (int i=0; i<array1.length; i++)
        {
            if(!list.contains(array1[i]))
            {
                list.add(array1[i]);
            }
            else
            {
                System.out.println("Duplicate numbers "+ array1[i]);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr={1,3,5,7,2,3,7};
        dup_num(arr);
    }
}
