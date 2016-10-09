
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AnagramComparator ac=new AnagramComparator();
		String[] array={"xy", "z", "yx", "a", "abc", "cba"};
		ac.sort(array);
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}

	}



}
