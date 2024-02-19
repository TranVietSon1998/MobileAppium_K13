package labs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab6 {

    public static void countAndPrintWords(String input) {

        String[] words = input.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        Map<String, Integer> wordCountMap = new TreeMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Output: -->");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }



    public static int convertToMinutes(String input) {
        int totalMinutes = 0;
        String regex = "(\\d+)\\s*(hrs|minutes)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            int value = Integer.parseInt(matcher.group(1));
            if (matcher.group(2).equals("hrs")) {
                totalMinutes += value * 60;
            } else {
                totalMinutes += value;
            }
        }

        return totalMinutes;
    }

    public static boolean authenticateUser(String correctPassword) {
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 3;
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("Enter your password: ");
            String userInput = scanner.nextLine();

            if (userInput.equals(correctPassword)) {
                // Correct password, authentication successful
                return true;
            } else {
                // Incorrect password, increment attempts
                attempts++;
                System.out.println("Incorrect password. Attempts left: " + (maxAttempts - attempts));
            }
        }

        // Too many incorrect attempts, authentication failed
        return false;
    }

    public static String extractDigits(String input) {
        StringBuilder digits = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }

        return digits.toString();
    }

    public static void checkUrlComponents(String url) {
        // Check protocol
        String protocol = getProtocol(url);
        System.out.println("Protocol: " + protocol);

        // Check domain
        String domain = getDomain(url);
        System.out.println("Domain: " + domain);

        // Check domain extension
        String extension = getDomainExtension(domain);
        System.out.println("Domain Extension: " + extension);
    }

    public static String getProtocol(String url) {
        if (url.startsWith("http://")) {
            return "http";
        } else if (url.startsWith("https://")) {
            return "https";
        }
        return "Unknown";
    }

    public static String getDomain(String url) {
        int protocolIndex = url.indexOf("://");
        if (protocolIndex != -1) {
            int domainStart = protocolIndex + 3; // Skip ://
            int domainEnd = url.indexOf('/', domainStart);
            if (domainEnd == -1) {
                domainEnd = url.length();
            }
            return url.substring(domainStart, domainEnd);
        }
        return "Unknown";
    }

    public static String getDomainExtension(String domain) {
        int dotIndex = domain.lastIndexOf('.');
        if (dotIndex != -1) {
            return domain.substring(dotIndex + 1);
        }
        return "Unknown";
    }

    public static void main(String[] args) {
        /*Lab1
        Given input string: "2hrs and 5 minutes"
        Please calculate how many minutes in total
         */
        String input1 = "2hrs and 5 minutes";
        String input2 = "3hrs and 10 minutes";

        System.out.println("Total minutes: " + convertToMinutes(input1));
        System.out.println("Total minutes: " + convertToMinutes(input2));

        /*
        LAB 6.2
        String myPassword = "password123";
        Allow user to input maximum 3 times
         */

        String correctPassword = "password123";
        boolean success = authenticateUser(correctPassword);

        if (success) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed. Too many attempts.");
        }

        /*
        LAB 6.3
        String myStr = "100 minutes";
        NOT using REGEX, extract digit character from that String
        Expected output: "100".
        EX: "12345nabc678" -> "12345678"
         */

        String myStr1 = "100 minutes";
        String myStr2 = "12345nabc678";
        String extractedDigits1 = extractDigits(myStr1);
        String extractedDigits2 = extractDigits(myStr2);
        System.out.println("Extracted digits 1: " + extractedDigits1);
        System.out.println("Extracted digits 2: " + extractedDigits2);

        /*
        LAB 6.4
        String url = "https://google.com";
        Check http OR https; domain name, .com OR .net
         */

        String url = "https://google.com";
        checkUrlComponents(url);

        /*
        LAB 6.5 (Optional)
        Allow user to input a sentence
        Count the words and group them
        Ex: Hello, tui ten teo, ban co phai ten teo khong?
        Output: -->
        Hello: 1
        tui: 1
        teo: 2
        ...
         */
        String sentence = "Hello, tui ten teo, ban co phai ten teo khong?";
        System.out.println("Input: "+sentence);
        countAndPrintWords(sentence);


    }
}

