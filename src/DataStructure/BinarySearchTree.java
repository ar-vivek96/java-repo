package DataStructure;

public class BinarySearchTree {
 Node root;
	class Node
	{
		int key;
		Node left,right;
		Node(int val)
		{
			key=val;
			left=right=null;
		}
	}
	BinarySearchTree(int val)
	{
		root=new Node(val);
	}
	BinarySearchTree()
	{
		root=null;
	}
	public Node insert(Node root,int val)
	{
		if(root==null)
			return new Node(val);
		
		if(val<root.key)
			root.left=insert(root.left,val);
		else
			if(val>root.key)
				root.right=insert(root.right, val);
		
		return root;
	}
	public void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
			
	}
	public Node search(Node root,int val)
	{
		if(root==null||root.key==val)
			return root;
		
		if(val<root.key)
			return 	search(root.left,val);
			else
			{
			return search(root.right,val);
			}
				
	}
	public void delete(int val)
	{
		root=delete(root,val);
	}
	public Node delete(Node root,int val)
	{
		if(root==null)
			return root;
		
		if(val<root.key)
			root.left=delete(root.left,val);
		else if(val>root.key)
			root.right=delete(root.right,val);
			else {
				if(root.left==null)
					return root.right;
				else if(root.right==null)
					return root.left;
			root.key=min(root.right);
			root.right=delete(root.right,root.key);
			}
		return root;
			
	}
	
	public int min(Node root)
	{
		int minVal=root.key;
		while(root.left!=null)
		{
			minVal=root.left.key;
			root=root.left;
		}
		return minVal;
	}
	

}
