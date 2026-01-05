/**
 * UC7: Store Character Pattern in a Class
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', getO());
        CharacterPattern P = new CharacterPattern('P', getP());
        CharacterPattern S = new CharacterPattern('S', getS());

        CharacterPattern[] word = {O, O, P, S};

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append(" ");
            }
            System.out.println(line);
        }
    }

    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static String[] getO() { return new String[]{" ***** "," *   * "," *   * "," *   * "," *   * "," *   * "," ***** "}; }
    static String[] getP() { return new String[]{" ****  "," *   * "," *   * "," ****  "," *     "," *     "," *     "}; }
    static String[] getS() { return new String[]{" ***** "," *     "," *     "," ****  ","     * ","     * "," ***** "}; }
}
