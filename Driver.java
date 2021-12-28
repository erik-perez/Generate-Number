import java.io.*;

public class Driver {
    static int n = 20;	//gives the length of the string to be generated
    public static void main(String[] args) {
        String Tester = GenerateNumber.genString(n); // Creates a string to test
        char[] binaryString = Tester.toCharArray(); // Converts the string to char array
        PrintStream printWrite = null;
        try {
            File fileWrite = new File("out.txt"); //name of the file being written to
            printWrite = new PrintStream(new BufferedOutputStream(new FileOutputStream(fileWrite, true)));
            printWrite.println("\nRecursive Test: " + Tester); //prints the first recursive test and the string being fixed
            long v1StartTime = System.currentTimeMillis(); //sets start time
            versionOne.revealStr(binaryString, 0, printWrite);   //calls the method in order to show each possible outcome and to print to the file
            long v1EndTime = System.currentTimeMillis(); //sets end time
            long v1TimeElapsed = v1EndTime - v1StartTime; //calculates time elapsed
            printWrite.print(v1TimeElapsed + " Milliseconds"); //prints the amount of time needed to operate
            printWrite.println("\nIterative Test: " + Tester);   //prints the first iterative test and the string being fixed
            long v2StartTime = System.currentTimeMillis(); //sets start time
            versionTwo.revealStrIterative(Tester, printWrite);  //calls the method in order to show each possible outcome and to print to the file
            long v2EndTime = System.currentTimeMillis(); //sets end time
            long v2TimeElapsed = v2EndTime - v2StartTime; //calculates time elapsed
            printWrite.print(v2TimeElapsed + " Milliseconds"); //prints the amount of time needed to operate
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Can't open file");
            System.exit(0);
        }
        printWrite.close();
    }
}
