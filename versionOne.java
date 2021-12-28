import java.io.PrintStream;

public class versionOne {
    static void revealStr(char binaryString[], int currentIndex, PrintStream write) {
        if(currentIndex == binaryString.length) { 
            write.println(binaryString); 
            return;
        }
        if(binaryString[currentIndex] == '*') { 
            binaryString[currentIndex] = '0'; 
            revealStr(binaryString, currentIndex + 1, write);  
            binaryString[currentIndex] = '1'; 	   
            revealStr(binaryString, currentIndex + 1, write); 
            binaryString[currentIndex] = '*';   
        }
        else
            revealStr(binaryString, currentIndex + 1, write); 
    }
}
