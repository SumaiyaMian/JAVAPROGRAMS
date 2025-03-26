public class BinarySearch{
 class Node{
  int key;
  Node left, right;
   public Node(int item){

    key=item;
    left=right=null;
   }
}
Node root;

BinarySearch(){
   root=null;
}
  void insert(int key){
    root=insertRec(root,key);
  }

  Node insertRec(Node root,int key){
   if (root==null){
    root=new Node(key);
    return root;
   }

   if (key<root.key)
   root.left=insertRec(root.left,key);
   else if(key>root.key)
   root.right=insertRec(root.right,key);
   return root;
   }

   void printTree(){
    printTree(root);
   }

   void printTree(Node node)
   {
    if (node!=null){

printTree(node.left);
System.out.print(node.key +" ");
printTree(node.right);
 }
}

public static void main(String [] args){
 BinarySearch tree=new BinarySearch();

    tree.insert(21);
    tree.insert(12);
    tree.insert(17);
    tree.insert(13);


 System.out.println("Binary Search Tree:");
   tree.printTree();

  }
}