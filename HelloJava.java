/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
/**
 *
 * @author Acer572
 */
public class HelloJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int[] c[] = new int[5][];
	// Перебор элементов внешнего массива
        for(int i=0;i<c.length;i++){
            c[i]=new int[i+1];
            // Перебор элементов вложенного массива
            for(int j=0;j<c[i].length;j++){
                // Пример выражения для генерации значений
                c[i][j]=(i+j+1); 
            }
        }
        // Вывод сформированных значений на печать
        for(int[] tmp1:c){
            for(int tmp2:tmp1){
                System.out.print(tmp2+"\t");
            }
            System.out.println();
        }
                System.out.println();
		int a='a';
		System.out.println(a);//97='a'
		int [] arr ;
		arr=new int[] {3,8,10,1,6};
		int [] arr1 = {5,3,4,6,8,10};
		int [] arr2 = {5,3,4,6,8,10};
		int [] arr3 = new int[]{10,8,6,4,3,5};
		Double [] in= new Double[]{10.0,8.0,6.0,4.0,3.0,5.0};
		Arrays.sort (in);
		Double[] tmp=new Double[in.length*2];
		System.arraycopy(in, 0, tmp, 0, in.length);
		in=tmp;
		for(Double i:in)
			System.out.print(i+"  ");
		System.out.println();
		System.out.println(Arrays.toString (in));
		boolean result1 = Arrays. equals (arr1, arr2);
		boolean result2 = Arrays. equals (arr1, arr3);
		System.out.println(Arrays.toString (arr));
		Arrays.sort (arr);
		int myIndex = Arrays.binarySearch (arr,6);
		System.out.println(Arrays.toString (arr));
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(myIndex);
		char [] chars = {'J','a','v','a'};
		String str = new String (chars);
		System.out.println(chars);
		System.out.println(str);
		String names ="0123456789";
		System.out.println(names.length());
		System.out.println(-4%3);
		boolean b;
		String st="foo";
		b=st instanceof String;
		System.out.println(b);
		b=st instanceof Object;
		System.out.println(b);
		int[][] coord = new int[5][15];
        // Перебор элементов внешнего массива
        for(int i=0;i<coord.length;i++){
            // Перебор элементов вложенного массива
            for(int j=0;j<coord[i].length;j++){
                // Пример выражения для генерации значений
                coord[i][j]=(i+j)*j; 
            }
        }
        // Вывод сформированных значений на печать
        for(int[] tmp1:coord){
            for(int tmp2:tmp1){
                System.out.print(tmp2+"\t");
            }
            System.out.println();
        }
        // Вывод сформированных значений столиком
        for(int[] tmp1:coord){
            System.out.println(tmp1[4]);
        }
        // Вывод сформированных значений строкой
        for(int tmp2:coord[4]){
                System.out.print(tmp2+"\t");
            }
            System.out.println();
	 }  
}