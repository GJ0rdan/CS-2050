//Garret Jordan
/*
we are going to create a program that puts the entire text of dracula into a
binary search tree.
*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class main {

    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new FileReader("dracula.txt"));
            String line;
            BST binarySearchTree = new BST();

            while ((line = input.readLine()) != null) {
                //using split to filter out newline
                String[] words = line.split("[ \n]+");

                for (String word : words) {
                    //using a for loop to insert each word into the tree
                    binarySearchTree.insert(word);
                }

            }
            input.close();

            BufferedWriter output = new BufferedWriter(new FileWriter("analysis.txt"));
            int height = binarySearchTree.maxHeight(binarySearchTree.root);
            int numOfNodes = binarySearchTree.totalNodes(binarySearchTree.root);
            //formula: 2^height - 1
            int maxPossibleNodes = (int) (Math.pow(2, height) - 1);

            output.write("the height of the tree is: "+height +"\n");
            output.write("The number of nodes are: "+numOfNodes +"\n");
            output.write("The max number of nodes possible are: "+ maxPossibleNodes +"\n");
            output.close();

            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
