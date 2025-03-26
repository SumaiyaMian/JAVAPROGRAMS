public class BinarySearch1 {
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearch1() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null) return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
                      if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            
            root.key = minValue(root.right);

                      root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    void printTree() {
        printTree(root);
    }

    void printTree(Node node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.key + " ");
            printTree(node.right);
        }
    }

    public static void main(String[] args) {
        BinarySearch1 tree = new BinarySearch1();
        tree.insert(21);
        tree.insert(12);
        tree.insert(17);
        tree.insert(13);
        System.out.println("Binary Search Tree:");
        tree.printTree();

        System.out.println("\nDeleting 12");
        tree.delete(12);
        System.out.println("Updated Binary Search Tree:");
        tree.printTree();
    }
}
