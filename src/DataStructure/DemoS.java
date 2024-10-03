package DataStructure;

public class DemoS {

	public static void main(String[] args) {
		
		BinarySearchTree bst=new BinarySearchTree(50);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 70);
		bst.insert(bst.root, 10);
		bst.insert(bst.root, 25);
		bst.insert(bst.root, 60);
		bst.insert(bst.root, 90);
		bst.inOrder(bst.root);
		if(bst.search(bst.root,10)==null)
			System.out.println("Not Found");
		else
		{
			System.out.println("Found");
		}
		
		bst.delete(bst.root, 70);
		bst.inOrder(bst.root);
		
	}

}
