import java.io.*;

public class Driver {
    static int n = 20;
    public static void main(String[] args) {
        String Tester = GenerateNumber.genString(n); 
        char[] binaryString = Tester.toCharArray(); 
        PrintStream printWrite = null;
        try {
            File fileWrite = new File("out.txt"); 
            printWrite = new PrintStream(new BufferedOutputStream(new FileOutputStream(fileWrite, true)));
            printWrite.println("\nRecursive Test: " + Tester); 
            long v1StartTime = System.currentTimeMillis(); 
            versionOne.revealStr(binaryString, 0, printWrite);   
            long v1EndTime = System.currentTimeMillis(); 
            long v1TimeElapsed = v1EndTime - v1StartTime; 
            printWrite.print(v1TimeElapsed + " Milliseconds"); 
            printWrite.println("\nIterative Test: " + Tester);   
            long v2StartTime = System.currentTimeMillis(); 
            versionTwo.revealStrIterative(Tester, printWrite);  
            long v2EndTime = System.currentTimeMillis(); 
            long v2TimeElapsed = v2EndTime - v2StartTime; 
            printWrite.print(v2TimeElapsed + " Milliseconds"); 
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Can't open file");
            System.exit(0);
        }
        printWrite.close();
    }
}
