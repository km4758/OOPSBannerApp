public class OOPSBannerapp {
    public static void main(String[] args) {
        String[] lines = new String[5];

lines[0] = String.join("  ", "  ****  ", "  ****  ", " *****  ", "  ****  ");
lines[1] = String.join("  ", " **  ** ", " **  ** ", " **  ** ", " **     ");
lines[2] = String.join("  ", " **  ** ", " **  ** ", " *****  ", "  ****  ");
lines[3] = String.join("  ", " **  ** ", " **  ** ", " **     ", "     ** ");
lines[4] = String.join("  ", "  ****  ", "  ****  ", " **     ", "  ****  ");

// Use a for-each loop to print each line
for (String line : lines) {
    System.out.println(line);
}

    }
}
