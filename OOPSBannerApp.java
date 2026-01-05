public class OOPSBannerApp {
    /**
     * Main method - Entry point of the application
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize array inline with String.join() calls
        String[] bannerLines = {
            String.join("", "  ***   ", "  ***   ", " ******* ", "  ****** "),
            String.join("", " *   *  ", " *   *  ", " *     * ", " *      *"),
            String.join("", "*     * ", "*     * ", "*       *", "*        "),
            String.join("", "*     * ", "*     * ", "*******  ", " ******* "),
            String.join("", "*     * ", "*     * ", "*        ", "        *"),
            String.join("", " *   *  ", " *   *  ", "*        ", "*      * "),
            String.join("", "  ***   ", "  ***   ", "*        ", " ****** ")
        };
        
        // Use enhanced for loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
} 