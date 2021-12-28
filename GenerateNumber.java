public class GenerateNumber {
    public static String genString(int n) {
        String options = "10*";
        StringBuilder sb = new StringBuilder(n); 
        for (int i = 0; i<n; i++) { 
            int index = (int)(options.length()*Math.random());
            sb.append(options.charAt(index));
        }
        return sb.toString(); 
    }
}
