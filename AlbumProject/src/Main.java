// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class arrayStackClass {
    public static void main(String[] args) {

        Path path = Paths.get(program3);
        Scanner scanner = new Scanner(path);
        System.out.println("Read text file using Scanner");
//read line by line
        while (scanner.hasNextLine()) {
            //process each line
            String line = scanner.nextLine();
            System.out.println(line);


        }
        scanner.close();
        }

}
        /*
        Path path = Paths.get("\"C:\\Users\\garre\\Downloads\\Program3.txt\"");
        Scanner scanner = new Scanner(path);
        System.out.println("Read text file using Scanner");
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();

         */
   // public static String InfixToPostfix (String s)