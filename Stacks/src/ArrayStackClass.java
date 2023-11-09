import java.util.Scanner;
import java.io.File;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code

public class ArrayStackClass {
    public static void main(String[] args) throws Exception {
        {
            File file = new File("C:\\Users\\garre\\Downloads\\Program3.txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
        }
    }
}
}
