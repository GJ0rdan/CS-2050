public class BST {
    Node root;
        public BST(){
            root = null;
        }

        public void insert(String data) {
            if (data == null || data.isEmpty()){//check if data is empty, if so do nothing
                return;
            }
            //make data lowercase, remove special characters like punct and numbers
            data = data.toLowerCase();
            data = data.replaceAll("[^a-zA-Z]", "");
            data = data.replaceAll("[0-9]", "");
            root = traverse(root, data);
        }
        //using recursion to traverse the tree
        private Node traverse(Node root, String data) {
            if (root == null) {//if root is empty create new node
                return new Node(data);
            }
            int comparison = data.compareTo(root.data);//compare the root word to the new word
            if (comparison < 0) {//if negative value put into left tree
                root.left = traverse(root.left, data);
            } else if (comparison > 0) {//if positive put into the right tree
                root.right = traverse(root.right, data);
            }
            return root;
        }
        //function that finds the total number of nodes in the tree
    public int totalNodes(Node root) {
        if (root == null){//base case, if root is empty set zero
            return 0;
        }
        //checking left and right side of tree recursively,
        int leftCount = totalNodes(root.left);
        int rightCount = totalNodes(root.right);

        return 1 + leftCount + rightCount; //adding one for the root, then the sum of left and right
    }
    //function the finds the largest height of the tree
    public int maxHeight(Node root)
    {
        if (root == null)
            return 1;// one for root
        else {
            //find the length of each branch using recursion
            int leftLength = maxHeight(root.left);
            int rightLength = maxHeight(root.right);

            // use the larger branch as the max height of tree
            if (leftLength > rightLength)
                return (leftLength + 1);
            else
                return (rightLength + 1);
        }
    }
}
