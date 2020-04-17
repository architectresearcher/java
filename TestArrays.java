import java.util.Arrays;

public class TestArrays{
	public static void main(String[] args){
		String[] myArray5 = new String[]{"a", "b", "c","a", "b", "c"};
		System.out.println(Arrays.toString(myArray5));
		int[] []myArray4 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(myArray4[2][0]);
		System.out.println(myArray4[2][1]);
		System.out.println(myArray4[2][2]);
		myArray4[2]=new int[]{1,2,3,4,5};
		System.out.println(myArray4[2][0]);
		System.out.println(myArray4[2][1]);
		System.out.println(myArray4[2][2]);
		System.out.println(myArray4[2][3]);
	}
}