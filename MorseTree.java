import java.util.Scanner;

public class MorseTree extends MorseTreeNode
{
    MorseTreeNode root;
    int size;

    public MorseTree() 
    { 
        root = new MorseTreeNode();
    }
    //method to add all the letter
    public void add (Object letter, Object morse) 
    {
        String element = (String) letter;
        String path = (String) morse;
        String currentNode = "";
        
        MorseTreeNode cursor = getRoot();
        MorseTreeNode temp = new MorseTreeNode();
        
        for (int i=0; i<path.length(); i++) 
        {
            currentNode = path.substring(i,i+1);
            if (currentNode.equals(".")) 
            {
                if (cursor.hasLeftChild()) 
                {
                    cursor = cursor.getLeftChild();
                } else {
                    cursor.setLeftChild(new MorseTreeNode());
                    size += 1;
                    temp = cursor;
                    cursor = cursor.getLeftChild();
                    cursor.setParent(temp);
                }
            } else {
                if (cursor.hasRightChild()) 
                {
                    cursor = cursor.getRightChild();
                } else {
                    cursor.setRightChild(new MorseTreeNode());
                    size += 1;
                    temp = cursor;
                    cursor = cursor.getRightChild();
                    cursor.setParent(temp);
                }
            }
        }
        cursor.setElement(element);
    }

    public String decode (String path) throws RuntimeException 
    {
    	String name = "";
        String currentNode = "";
        int j = 0;
        MorseTreeNode cursor = getRoot();
        
        for (int i = 0; i < path.length(); i++) 
        {
            currentNode = path.substring(i,i+1);
            if (currentNode.equals(".")) 
            {
                if (cursor.hasLeftChild()) 
                {
                    cursor = cursor.getLeftChild();
                    j = 0;
                } else {
                    throw new RuntimeException("Code pattern not found.");
                }
            } else if (currentNode.equals("-")) 
            {
                if (cursor.hasRightChild()) 
                {
                    cursor = cursor.getRightChild();
                    j = 0;
                } else {
                    throw new RuntimeException("Code pattern not found. ");
                }
            }else if (currentNode.equals("_")) 
            {
            	j++;
            	if(j >= 2)
            	{
            		String space = " ";
            		name += space;
            	}
            	if(j < 2)
            	{
            		name += (String) cursor.element();
                    cursor = getRoot();
            	}
            	
            }else if (currentNode.equals("#")) 
            {
            	return name += (String) cursor.element();
            }
        } 
        return name += (String) cursor.element();
    } 
    public MorseTreeNode getRoot() 
    {
        return root;
    } 
    public int size() 
    {
        return size;
    } 
}