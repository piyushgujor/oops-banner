public class UC4BannerApp {

    // Method to display banner
    public static void displayBanner(String[] bannerLines) {

        // Enhanced for-loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // Banner stored in String array (Centralized data structure)
        String[] banner = {
            "************************************************",
            "*                                              *",
            "*            WELCOME TO SRM UNIVERSITY        *",
            "*            OOPS BANNER APPLICATION           *",
            "*                                              *",
            "************************************************"
        };

        // Calling method to display banner
        displayBanner(banner);
    }
}

