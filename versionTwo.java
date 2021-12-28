import java.io.PrintStream;
import java.util.Stack;

public class versionTwo {
    static void revealStrIterative(String binaryString, PrintStream write) {
        Stack<String> BinaryStack = new Stack<String>(); //creates a stack of strings
        BinaryStack.push(binaryString);    //adds the binaryString to stack
        int found;
        while(!BinaryStack.empty()) {  // Loops until the stack is empty
            String BinaryString = BinaryStack.pop();  //removes the binaryString from stack
            if((found = BinaryString.indexOf('*')) != -1) { //finds where * is within the string, and keeps track of the index
                for(char repaceChar = '0'; repaceChar <= '1'; repaceChar++) { // Loops from '0' to '1'
                    BinaryString = BinaryString.substring(0, found) + repaceChar + BinaryString.substring(found + 1);
//Separates the string from index 0 to the first index of *, then prints a new variable instead and concatenates it with the remaning string until the next index of *
                    BinaryStack.push(BinaryString); //adds the result binary string to stack
                }
            }
            else {
                write.println(BinaryString); // Writes the string to file
            }
        }
    }
}
