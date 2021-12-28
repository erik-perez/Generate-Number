import java.io.PrintStream;

public class versionOne {
    static void revealStr(char binaryString[], int currentIndex, PrintStream write) {
        if(currentIndex == binaryString.length) { //Checks if the current index is equals to length of the character array
            write.println(binaryString); //prints it to the file
            return;
        }
        if(binaryString[currentIndex] == '*') { // looks through to see if there's a * in the string
            binaryString[currentIndex] = '0'; //replace the current index with a 0
            revealStr(binaryString, currentIndex + 1, write);  //calls the method and increases index by 1
            binaryString[currentIndex] = '1'; 	   // replaces the current index with 1
            revealStr(binaryString, currentIndex + 1, write); //calls the method and increases index by 1
            binaryString[currentIndex] = '*';   //replaces the current index to *
        }
        else
            revealStr(binaryString, currentIndex + 1, write); //calls the method and increases index by 1
    }
}
