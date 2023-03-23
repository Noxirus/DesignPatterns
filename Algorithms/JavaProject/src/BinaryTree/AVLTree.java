package BinaryTree;

public class AVLTree {
    class AVLNode{
        int value;
        int height;
        AVLNode leftChild;
        AVLNode rightChild;


        public AVLNode(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Value= " + this.value;
        }
    }

    private AVLNode root;

    public void insert(int value){
        root = insert(root, value);
    }

    private AVLNode insert(AVLNode root, int value){
        if(root == null)
            return new AVLNode(value);

        if(value < root.value){
            root.leftChild = insert(root.leftChild, value);
        }
        else{
            root.rightChild = insert(root.rightChild, value);
        }

        recalculateHeight(root);

        return balance(root);
    }

    private AVLNode balance(AVLNode root){
        if(isLeftHeavy(root)){
            if(balanceFactor(root.leftChild) < 0)
               root.leftChild = rotateLeft(root.leftChild);
            return rotateRight(root);
        }
        else if(isRightHeavy(root)){
            if(balanceFactor(root.rightChild) > 0)
               root.rightChild = rotateRight(root.rightChild);
            return rotateLeft(root);
        }

        return root;
    }

    private AVLNode rotateRight(AVLNode root){
        AVLNode newRoot = root.leftChild;
        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        recalculateHeight(root);
        recalculateHeight(newRoot);

        return newRoot;
    }

    private AVLNode rotateLeft(AVLNode root){
        AVLNode newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        recalculateHeight(root);
        recalculateHeight(newRoot);

        return newRoot;
    }

    private void recalculateHeight(AVLNode root){
        root.height = Math.max(height(root.leftChild), height(root.rightChild)) + 1;
    }

    private int height(AVLNode root){
        return (root == null) ? -1 : root.height;
    }

    private boolean isLeftHeavy(AVLNode root){
        return balanceFactor(root) > 1;
    }

    private boolean isRightHeavy(AVLNode root){
        return balanceFactor(root) < -1;
    }

    private int balanceFactor(AVLNode root){
        return (root == null) ? 0 : height(root.leftChild) - height(root.rightChild);
    }
}
