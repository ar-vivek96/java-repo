package DataStructure;

public class BinaryTree {
	Node root;
	class Node{
		int data;
		Node left,right;
		
		Node(int val)
		{
			data=val;
			left=null;
			right=null;
		}
	}
	BinaryTree(int val)
	{
		root=new Node(val);
	}
	
	public  void insertLeft(Node r,int val)
	{
		Node newNode=new Node(val);
		r.left=newNode;
	}
		
	public void insertRight(Node r,int val)
	{
		Node newNode=new Node(val);
		r.right=newNode;
	}
	public static void preOrder(Node root)
	{
		if(root!=null) {
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		}
	}
	public static void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	public static void postOrder(Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	
	
	}
