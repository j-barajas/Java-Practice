import java.util.Iterator;
import java.lang.reflect.Array;
import java.util.Arrays;

public class LessonNineArrays {
	public static void main(String[] args) {
		
		int[] randomArray;
		int[] numberArray = new int[10];
		
		randomArray = new int[20];
		randomArray[1] = 2;
		
		String[] stringArray = {"just", "random", "words"};
		
		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = i;
		}
		
		int k =1;
		while (k<=41) { System.out.print('-'); k++;	}
		System.out.println();
		
		for (int j = 0; j < numberArray.length; j++) {
			System.out.print("| "+j+" ");
		}
		System.out.println("|");
		
		k = 1;
		while (k<=41) { System.out.print('-'); k++;	}
		System.out.println();
		
		//2d array populated 0-99
		String[][] multiArray = new String[10][10];
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				multiArray[i][j] = i+" "+j;
			}
		}		
		
		k = 1;
		while (k<=61) { System.out.print('-'); k++;	}
		System.out.println();
		
		//Print out 2d array manually
		for (int i = 0; i < multiArray.length; i++) {
			for (int j = 0; j < multiArray[i].length; j++) {
				System.out.print("| "+multiArray[i][j]+" ");
			}
			System.out.println("|");
		}
		
		k = 1;
		while (k<=61) { System.out.print('-'); k++;	}
		System.out.println();
		
		//enhanced for loop array printer
		for (int row : numberArray) {
			System.out.print(row);
		}
		
		System.out.println();
		
		k = 1;
		while (k<=61) { System.out.print('-'); k++;	}
		System.out.println();
		
		//Enhanced for loop multi-dimensional array
		//for(String[]rows : multiArray
		for(String[] rows: multiArray) {
			for (String column : rows) {
				System.out.print("| "+column+" ");
			}
			System.out.println("|");
		}
		
		k = 1;
		while (k<=61) { System.out.print('-'); k++;	}
		System.out.println();
		
		//copy arrays
		int[] numberCopy = Arrays.copyOf(numberArray, 5);
		
		for (int row : numberCopy) {
			System.out.print(row);
		}
		
		System.out.println("\n");
		
		//copy array range 
		int[] rangeArray = Arrays.copyOfRange(numberArray, 3, 6);
		
		//print out entire array
		System.out.println(Arrays.toString(numberCopy));
		
		//fill array
		int[] moreNumbers = new int[100];
		Arrays.fill(moreNumbers, 2);
		System.out.println("\n"+Arrays.toString(moreNumbers)+"\n");
		
		//fill 2d array with *
		char[][] boardGame = new char[10][10];
		for(char[] row: boardGame) {
			Arrays.fill(row, '*');
		}
		
		for(char[] row : boardGame) {
			for(char column : row) {
				System.out.print("|"+column+"|");
			}
			System.out.println();
		}
		System.out.println("\n");
		
		//sort array
		int[] numtoSort = new int[10];
		
		for(int i=0; i<10; i++) {
			numtoSort[i]=(int)(Math.random()*100);
		}
		
		for(int num : numtoSort) {
			System.out.print(num+" ");
		}
		
		Arrays.sort(numtoSort);
		System.out.println("\n");
		System.out.println(Arrays.toString(numtoSort));
		
		//binary search
		int whereIs50 = Arrays.binarySearch(numtoSort, 50);
		System.out.println(whereIs50);
		
		
		
	}//end main
}
