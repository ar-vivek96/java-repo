package DataStructure;

public class AVL {
	Node root;
	class Node
	{
		int key;
		Node left,right;
		int height;
		public Node(int val)
		{
			key=val;
			left=right=null;
			height=0;
			
		}
	}
	AVL(int val)
	{
		root=new Node(val);
	}
	AVL()
	{
		root=null;
	}
	public int getHeight(Node node)
	{
		if(node==null)
			return -1;
		
		return node.height;
	}
	public void insert(int val)
	{
		root=insert(root,val);
	}
	public Node insert(Node node,int val)
	{
		if(node==null)
			return new Node(val);
		
		if(val<node.key)
			node.left=insert(node.left,val);
		else if(val>node.key)
			node.right=insert(node.right,val);
		else
			return node;
	
		node.height=1+(max(getHeight(node.left),getHeight(node.right)));
		int balFactor=getBalanceFactor(node);
		//LL Case
			if(balFactor>1&&val<node.left.key)
			{
				return rightRotate(node);
			}
		// LR Case
			if(balFactor>1&&val>node.left.key)
			{
				node.left=leftRotate(node.left);
				return rightRotate(node);
			}
		//RR Case
			if(balFactor<-1&&val>node.right.key)
			{
				return leftRotate(node);
			}
		//RL Case
			if(balFactor<-1&&val<node.right.key)
			{
				node.right=rightRotate(node.right);
				return leftRotate(node);
			}
				
		return node;
	}
	private int getBalanceFactor(Node node)
	{
		if(node==null)
			return 0;
		
		return getHeight(node.left)-getHeight(node.right);
	}
	public int max(int a,int b)
	{
		
		return a>b?a:b; 
	}
	private Node rightRotate(Node z)
	{
		Node y=z.left;
		Node t3=y.right;
		
		y.right=z;
		z.left=t3;
		
		z.height=1+max(getHeight(z.right),getHeight(z.right));
		y.height=1+max(getHeight(y.left),getHeight(y.right));
		
		
		return y;
	}
	private Node leftRotate(Node z)
	{
		Node y=z.right;
		Node t3=y.left;
		y.left=z;
		z.right=t3;
		z.height=1+max(getHeight(z.left),getHeight(z.right));
		y.height=1+max(getHeight(y.left),getHeight(y.right));
		
		return y;
	}
	public void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.println(root.key+" height is "+root.height);
			inOrder(root.right);
		}
	
	}
}