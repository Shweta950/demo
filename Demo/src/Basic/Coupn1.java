package Basic;

import java.util.ArrayList;
import java.util.List;

public class Coupn1 {

	int min = 1;

	int max = 10;



	public Coupn1(int row, int col, int cpr) {



		int[][] array = new int[row][col];



		int[] cell_show = new int[cpr];

		List<Integer> list = rangen(min, max, row);

		int[][] arr = add(row, col);



		disp(arr, row, col);

		List<Integer> block = blank_spaces_list(col, row, cpr, array);

		System.out.println("block........." + block.toString());



		blank(row, col, block, arr);

	}

	// generating random values and adding to list



	public List<Integer> rangen(int min, int max, int row) {

		ArrayList<Integer> list = new ArrayList<>();

		Cells cs = new Cells();

		int count = 0;

		while (list.size() != 27) {

			count = 0;

			while (count != row) {



				cs.setValue(min, max);

				int cell = cs.getValue();



				if (!list.contains(cell)) {

					list.add(cell);

					count++;

				}



			}

			min = min + 10;

			max = max + 10;

		}

		list.sort(null);

		// System.out.println(list.toString());

		return list;



	}

	// System.out.println(list.toString());



	public int[][] add(int row, int col) {

		int[][] array = new int[row][col];

		List<Integer> list = rangen(min, max, row);

		List<Integer> list2 = rangen(min, max, row);

		int val = 0;

		int count1 = 0;



		for (int i = 0; i < col; i++) {



			for (int j = 0; j < row; j++) {

				array[j][i] = list.get(count1);

				count1++;

			}

		}



		return array;



	}



	public void disp(int[][] arr, int row, int col) {

		// Logic for printing the elements in a array



		System.out.println("-------------------------------------------");

		for (int i = 0; i < row; i++) {



			for (int j = 0; j < col; j++) {



				if (arr[i][j] != 0) {

					int val = arr[i][j];

					System.out.print(val + " | ");

				} else {

					System.out.print("   |");

				}

			}

			System.out.println("\n-------------------------------------------");

		}



	}

	// code to generate blank spaces



//	public Cells[][] blank_spaces(int Cells[][],int cpr) {

//		int blank = 0;

//		

//		for(int i = 0; i < Cells.length  ;i++) {

//			int hmr=Cells[i].length;

//			for(int j = 0; j < hmr ;j++) {

//				for(int k=0;k<=hmr;k++) {

//				if(k<=2) {

//				Cells cs=new Cells();

//				blank = cs.getValue();

//				}

//				}

//				Cells cs=new Cells();

//				blank = cs.getValue();

//			}

//		}

//		return blank_spaces(Cells, cpr);

//	}



	public List<Integer> blank_spaces_list(int col, int row, int cpr, int[][] array) {

		

		Cells cs = new Cells();

		ArrayList<Integer> list = new ArrayList<Integer>();

		ArrayList<Integer> list1 = new ArrayList<Integer>();

		ArrayList<Integer> final_list = new ArrayList<Integer>();

		// HashSet<Integer> set=new HashSet<Integer>();

		int count = 0;

		int gen = 0;

		

		int rowlength = col;



		gen = rowlength - cpr;

		System.out.println("generation: " + gen + " How many rows : " + rowlength + " Cpr :" + cpr);

		int i ;

		int j = 0;

		for(i=0;i<row;i++) {

			if(list.isEmpty()==true) {

		while (j != gen) {

			cs.setValue(0, rowlength);

			count = cs.getValue();



			if (!list.contains(count)) {

				

				System.out.println(count);

				list.add(count);

				j++;

			}

			

			}

		list1=list;

		final_list=list1;

		if(list1.containsAll(list)) {

			list.removeAll(list);

		}



		}

		final_list=list;

		}

		return final_list;



	}

	

	

	



	public void blank(int row, int col, List<Integer> list, int[][] array) {

		int[] arr1 = new int[list.size()];

		



		int x;

		

		for (x = 0; x <=row; x++) {

			arr1[x] = list.get(x);

			System.out.println("len" + arr1[x]);

		}



			for(int j=0;j<row;j++) {

			for(int i = 0; i < arr1.length; i++) {

				

				array[j][arr1[i]] = 0;

				System.out.println(arr1[i] + "is made Blank");

			}

			}

			System.out.println("-------------------------------------------");

			for (int i = 0; i < row; i++) {



				for (int j = 0; j < col; j++) {



					if (array[i][j] != 0) {

						int val = array[i][j];

						System.out.print(val + " | ");

					} else {

						System.out.print("   |");

					}

				}

				System.out.println("\n-------------------------------------------");

			}

			

		

	}



	public static void main(String[] args) {

		//Coupn1 cp = new Coupn1(3, 9, 5);



	}



}

