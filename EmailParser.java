public class EmailParser {

    // Parse email and return "firstname lastname" (simple behavior)
    public static String parseName(String email) {
        if (email == null) return "";
        int at = email.indexOf('@');
        if (at <= 0) return "";

        // username = portion before '@'
        String username = email.substring(0, at).toLowerCase();

        // Splits and return the first and last name. 
        String[] parts = username.split("\\.");
        if (parts.length >= 2) {
            return parts[0] + " " + parts[1];
        } else if (parts.length == 1) {
            return parts[0];
        } else {
            return "";
        }
    }
