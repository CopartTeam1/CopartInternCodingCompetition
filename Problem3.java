import java.util.ArrayList;

public class Problem2 {
	
	public static void main(String[] args) {
		char array[][]={{'m','v','j','l'},{'j','h','b','x'},{'h','k','t','t'},{'r','w','a','i'}};

		ArrayList<String> result=findWords(array);
		
	}

	private static ArrayList<String>  findWords(char[][] array) {
		
		int height=array.length;
		int width=array[0].length;
		
		ArrayList<String>  words=new ArrayList<String>();
		
		for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				
				//TODO populate possible words
				//Call DictionaryNode traverse method
				
				
				
			}
		}
		
		
		
		
		return null;
		
	}
	
	
	

}
