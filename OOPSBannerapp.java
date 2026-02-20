import java.util.HashMap;

public class OOPSBannerapp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters using stars.
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        });

        charMap.put('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        charMap.put('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        return charMap;
    }

    /**
     * Displays the banner message by concatenating pattern lines horizontally.
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Get height from 'O' pattern (7 lines)
        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {
            StringBuilder bannerLine = new StringBuilder();
            for (char ch : message.toUpperCase().toCharArray()) {
                if (charMap.containsKey(ch)) {
                    bannerLine.append(charMap.get(ch)[line]).append("  ");
                }
            }
            System.out.println(bannerLine);
        }
    }

    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}
