package readability;

import java.util.Arrays;

public class ListArr {
    public String[] sentences(String string) {
        String[] list = string.split("[?.!]");
        return list;
    }

    public int words(String[] arr) {
        int sum = 0;
        for (String x : arr) {
            String[] arr2 = x.trim().split(" ");
            sum = arr2.length + sum;
        }
        return sum;
    }

    public int[] getNumSyllables(String content) {

        int numSyllables = 0;
        int numPolysyllables = 0;
        String[] words = content.split("[ \n]");
        for (String x : words) {
            int inThisWord = 0;
            boolean lastWasVowel = false;
            for (int i = 0; i < x.length(); i++) {
                String now = "" + x.charAt(i);
                if (now.matches("[aeiouy]")) {
                    if (!lastWasVowel) {
                        inThisWord++;
                        lastWasVowel = true;
                    }
                } else {
                    lastWasVowel = false;
                }
            }
            char finalLetter = 0;
            for (int j = x.length() - 1; j >= 0; j--) {
                char nowLetter = x.charAt(j);
                if (Character.isLetter(nowLetter)) {
                    finalLetter = nowLetter;
                    break;
                }
            }
            if (finalLetter == 'e' || finalLetter == 'E') {
                inThisWord--;
            }
            if (inThisWord == 0) {
                inThisWord = 1;
            }
            if (inThisWord > 2) {
                numPolysyllables++;
            }
            numSyllables += inThisWord;

        }
        return new int[]{numSyllables, numPolysyllables};

    }



    public String switchAge(double score) {
        int x = (int) Math.ceil(score);
        switch (x) {
            case 1:
                return "6";
            case 2:
                return "7";
            case 3:
                return "9";
            case 4:
                return "10";
            case 5:
                return "111";
            case 6:
                return "12";
            case 7:
                return "13";
            case 8:
                return "14";
            case 9:
                return "15";
            case 10:
                return "16";
            case 11:
                return "17";
            case 12:
                return "18";
            case 13:
                return "24";
            case 14:
                return "24+";
            default:
                return null;
        }
    }

}
