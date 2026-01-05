/**
 * OOPSBannerApp - Render OOPS as Banner using String Array and Loop
 */
public class OOPSBannerApp {
    
    public static void main(String[] args) {
        // Create an empty String array to hold 7 lines
        String[] bannerLines = new String[7];
        
        // Populate each line using String.join()
        bannerLines[0] = String.join("", "  ***   ", "  ***   ", " ******* ", "  ****** ");
        bannerLines[1] = String.join("", " *   *  ", " *   *  ", " *     * ", " *      *");
        bannerLines[2] = String.join("", "*     * ", "*     * ", "*       *", "*        ");
        bannerLines[3] = String.join("", "*     * ", "*     * ", "*******  ", " ******* ");
        bannerLines[4] = String.join("", "*     * ", "*     * ", "*        ", "        *");
        bannerLines[5] = String.join("", " *   *  ", " *   *  ", "*        ", "*      * ");
        bannerLines[6] = String.join("", "  ***   ", "  ***   ", "*        ", " ****** ");
        
        // Use enhanced for loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}