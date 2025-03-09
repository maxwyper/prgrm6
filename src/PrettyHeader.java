public class PrettyHeader {

    public static void main(String[] args) {
        SafeInput.prettyHeader("Message Centered Here");
    }
}

class SafeInput {

    // Method to create the pretty header
    public static void prettyHeader(String msg) {
        int totalWidth = 60;  // Total width of the header
        int starsAtEachEnd = 3;  // Number of stars at the start and end of the message line
        int messageLength = msg.length();
        
        // Calculate how much space we have for centering the message
        int messageStartPos = (totalWidth - starsAtEachEnd * 2 - messageLength) / 2;

        // Print the top row of stars
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();  // Newline after the top row

        // Print the second row with the message centered
        System.out.print("*".repeat(starsAtEachEnd));  // Print leading stars
        for (int i = 0; i < messageStartPos; i++) {
            System.out.print(" ");  // Print spaces before the message
        }
        System.out.print(msg);  // Print the message
        for (int i = 0; i < (totalWidth - starsAtEachEnd * 2 - messageLength - messageStartPos); i++) {
            System.out.print(" ");  // Print spaces after the message
        }
        System.out.print("*".repeat(starsAtEachEnd));  // Print trailing stars
        System.out.println();  // Newline after the second row

        // Print the bottom row of stars
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();  // Newline after the bottom row
    }
}
