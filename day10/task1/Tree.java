package day10.task1;


public class Tree {

    private Node root;

    public void addValue(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.addLeftOrRight(value, root);
        }
    }

    public void printSortTree() {
        print(root);
    }

    private void print(Node currentNode) {


        if (currentNode.getLeftChild() != null) {  //Рекурсией доходим до самого маленького элемента.
            print(currentNode.getLeftChild());
        }
      System.out.println(currentNode.getValue());

        if (currentNode.getRightChild() != null) {
            print(currentNode.getRightChild());
        }
    }


}

