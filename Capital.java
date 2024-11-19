import java.util.Scanner;

public class Capital {
    String sent;
    int freq;
    
    Capital() {
        sent = "";
        freq = 0;
    }
    
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        sent = sc.nextLine();
        sc.close();
    }

    boolean isCap(String w) {
        if (w.length() > 0 && Character.isUpperCase(w.charAt(0))) {
            return true;
        }
        return false;
    }

    void display() {
        String[] words = sent.split("\\s+");
        freq = 0;

        for (String word : words) {
            if (isCap(word)) {
                freq++;
            }
        }

        System.out.println("Sentence: " + sent);
        System.out.println("Words beginning with a capital letter: " + freq);
    }

    public static void main(String[] args) {
        Capital cap = new Capital();
        cap.input();
        cap.display();  }  }
