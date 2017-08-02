
import java.util.HashMap;


/**
 * 
 * 
 *  @author Ravi
 * 
 * 	DictionaryNode is node in a Tries of dictionary words.
 *
 *
 */

public class DictionaryNode {
	
	public static HashMap<Character,DictionaryNode> initialList=new HashMap<Character,DictionaryNode>();
	public Character letter;
	public HashMap<Character,DictionaryNode> list=new HashMap<Character,DictionaryNode>();
	
	// this flag will be true if there exist a word ending at this node.
	boolean isWord;
	
	
	/**
	 * @param word : search word
	 * @param index : char index in String prefix
	 * 
	 * @return null if String word is not present in the dictionary otherwise returns word 
	 * 
	 * 			 
	 */
	public String traverse(String word,int index)
	{
		
		if(this.isWord)
		{
			//if correct word found than return the word
			return word.substring(0, index);
		}
		else
		{
			if(index+1 >word.length() && list.containsKey(word.charAt(index+1)))
				{
				DictionaryNode nextNode=list.get(word.charAt(index+1));
				return  nextNode.traverse(word,index+1);
				}
			
			return null;
		}
			
		
		
		
	}
	

}
