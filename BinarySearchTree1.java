class BinarySearchTree1 {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    public BinarySearchTree1() {
        root = null;
    }

    public Node insert(Node root, int key) { // Fixed method declaration
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insert(root.left, key); // Recursively insert in the left subtree
        } else if (key > root.data) {
            root.right = insert(root.right, key); // Recursively insert in the right subtree
        }
        return root; // Return the unchanged root pointer
    }

    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key > root.data) {
            return search(root.right, key);
        }
        return search(root.left, key);
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) { // Fixed method signature
        BinarySearchTree1 tree = new BinarySearchTree1();

        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 21);
        tree.root = tree.insert(tree.root, 1);

        System.out.print("Inorder traversal of BST: ");
        tree.inorder(tree.root);
        System.out.println();

        int keyToSearch = 12; // Fixed variable name
        System.out.println("Searching for the node with the key: " + keyToSearch);

        if (tree.search(tree.root, keyToSearch)) {
            System.out.println("Node with key " + keyToSearch + " found");
        } else {
            System.out.println("Node with key " + keyToSearch + " not found");
        }

        keyToSearch = 21;
        System.out.println("Searching for the node with key: " + keyToSearch);
        if (tree.search(tree.root, keyToSearch)) {
            System.out.println("Node with key " + keyToSearch + " found");
        } else {
            System.out.println("Node with key " + keyToSearch + " not found");
        }
    }
}
