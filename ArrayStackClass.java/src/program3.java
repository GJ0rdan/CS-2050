
// Garret Jordan
import java.io.*;

public class program3 {
//taking a string and sorting it from infix to postfix notation
    public static String InfixToPostfix (String s) throws Exception{
        ArrayStackClass stack = new ArrayStackClass(32);
        String postfix = "";

        //reading in characters one at a time and pushing them to stack
        for (int i = 0; i< s.length(); i++){
            char character = s.charAt(i);
            //TODO fix operand check for decimal
            if(isOperand(character)) {
                postfix += character;
            }else if (character == '*'|| character == '/' || character == '+'|| character == '-'){

                while(!stack.isEmpty()){

                    if(precedence(character) >= precedence(stack.peek()))
                        break;
                    postfix += stack.pop();
                }//Push the current operator onto the stack.
                stack.push(character);
            }else if (character == '('){
                stack.push(character);
            //f you encounter a closing parenthesis ')',
            // pop operators from the stack and add them to the output until you find
            // the corresponding opening parenthesis. Pop and discard the opening parenthesis.
            }else if (character == ')'){
                while(!stack.isEmpty() && stack.peek()!= '(')
                    postfix += stack.pop();
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
            }
            // After processing all characters in the infix
            //expression, pop any remaining operators from the stack and add them to the output.
        }
        while(!stack.isEmpty()){
            postfix += stack.pop();
        }
        return postfix;
        }

        private static int precedence(char operator){
            switch (operator) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                default:
                    return -1;
            }
        }
        private static boolean isOperand(char character){
            return((character >= '0' && character <= '9') || character == '.' || character == ' ');
        }

    public static void main(String[] args) throws Exception {

            BufferedReader input = new BufferedReader(new FileReader("C:\\Users\\garre\\Downloads\\Program3 (3).txt"));
            BufferedWriter output = new BufferedWriter(new FileWriter("program3.out"));

            String s;

            while((s = input.readLine())!= null){
                String postfix = InfixToPostfix(s);
                output.write('\n'+"Infix: " +s );
                output.write('\n'+"Postfix: " +postfix );

            }
            input.close();
            output.close();

                //call function then print out inside while loop
    }
}
