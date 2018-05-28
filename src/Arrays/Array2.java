package Arrays;

/*
Every array in java is an object so we always 
create it with "new" operator
 */
//package Day3;

/**
 *
 * @author boss 123
 */
public class Array2 {
    public static void main(String[] args) {
        int[] array1=new int[5];
 // At the time of construction it is compulsary to specify size or it will result into error
        int array2[]=new int[4];
        array2[0]=5;
        array2[1]=10;
        array2[2]=12;
        array2[3]=13;
        for(int i:array2)
        {
            System.out.println(i);
        }
        int array3[]={4,5,6,7};
	for(int i:array3)
        {
            System.out.println(i);
        }
    
    }
}
