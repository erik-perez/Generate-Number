import java.io.PrintStream;
import java.util.Stack;

public class versionTwo {
    static void revealStrIterative(String binaryString, PrintStream write) {
        Stack<String> BinaryStack = new Stack<String>(); 
        BinaryStack.push(binaryString);   
        int found;
        while(!BinaryStack.empty()) {  
            String BinaryString = BinaryStack.pop();  
            if((found = BinaryString.indexOf('*')) != -1) { 
                for(char repaceChar = '0'; repaceChar <= '1'; repaceChar++) {
                    BinaryString = BinaryString.substring(0, found) + repaceChar + BinaryString.substring(found + 1);

                    BinaryStack.push(BinaryString); 
                }
            }
            else {
                write.println(BinaryString); 
            }
        }
    }
}
