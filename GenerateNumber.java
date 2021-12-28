public class GenerateNumber {
    public static String genString(int n) {
        String options = "10*"; //provides the different chars that the string can be made of
        StringBuilder sb = new StringBuilder(n); //allows for the construction of a string
        for (int i = 0; i<n; i++) { //populates each position of the string with either a 1, 0 or *, runs until n which is determined in the driver
            int index = (int)(options.length()*Math.random());
            sb.append(options.charAt(index));
        }
        return sb.toString(); //returns the now generated string
    }
}