package Basic;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cells {

	private int value;

	private int blank;

	



	public int getBlank() {

		return blank;

	}



	public void setBlank(int blank) {

		this.blank = blank;

		

	}



	public int getValue() {

		return value;

	}



	public void setValue(int min,int max) {

		

		Random ran = new Random();

		int cell = ThreadLocalRandom.current().nextInt(min, max);

		this.value = cell;

		}


		





//	public List<Integer> generatecol(int min,int max,int row) {

//	

//		Random ran=new Random();

//		

//		for(i=0;i<3;i++) {

//			

//			int cell=nextInt(min,max);

//			arr[i]=cell;

//			int res=arr[i];

//		}

//		

//		return res;

//		

//		

//	}

//		int res=row*col;

//		HashSet<Integer> set=new HashSet<Integer>();

//	     Random ran=new Random();

//	   	 int cell = 0;

//	   	 for(int i=0;i<col;i++) {

//	   		 for(int j=0;j<row;j++) {

//	   	 while(set.size() != res) {

//	   	cell = ThreadLocalRandom.current().nextInt(min,max);

//	   	array[j][i]=cell;

//	   	 set.add(cell);

//	   	 }

//	   	 System.out.println(set.toString());

//	   	 }

//	   	 }

//	}

//	   	 for(Integer i:set) {

//	   		 list.add(i);

//	   	 }

//	   	

	   	 

	   	 

	   	 

//	     return list.toString();	

	        

	

	

	private int nextInt(int min, int max) {

		// TODO Auto-generated method stub

		return 0;

	}



	public static void main(String[] args) {

		Cells cs=new Cells();

		//cs.generatecol(9);

	}

	



}

