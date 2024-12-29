import java.util.*;

public class quiz {
    public static void main(String[] args) {
        ques_ans ques = new ques_ans();
        ques_ans ans = new ques_ans();

        Scanner input = new Scanner(System.in);
        char answer;
        int correct = 0, wrong = 0;
        ques.ques1();
        answer = input.next().charAt(0);
        if (answer == ans.ans1) {
            correct++;
        } else {
            wrong++;
        }
        ques.ques2();
        answer = input.next().charAt(0);
        if (answer == ans.ans2) {
            correct++;
        } else {
            wrong++;
        }
        ques.ques3();
        answer = input.next().charAt(0);
        if (answer == ans.ans3) {
            correct++;
        } else {
            wrong++;
        }
        ques.ques4();
        answer = input.next().charAt(0);
        if (answer == ans.ans4) {
            correct++;
        } else {
            wrong++;
        }
        ques.ques5();
        answer = input.next().charAt(0);
        if (answer == ans.ans5) {
            correct++;
        } else {
            wrong++;
        }
        double corr_double  = correct;
        double percentage = (corr_double/10)*200;
         System.out.println("total number of question : 5");
         System.out.println("total number of correct answer : " + correct);
         System.out.println("total number of worng answer : " + wrong);
         System.out.println("total number of percentage ratio : " +percentage);
    }
}

class ques_ans {
    void ques1() {
        System.out.println("what is the sum of 4+6 ? \r\n" +
                "A) 4\r\n" +
                "B) 8\r\n" +
                "C) 10\r\n" +
                "D) 11\r\n");
    }

    void ques2() {
        System.out.println("what is the division of 12/3 ?\r\n" +
                "A) 4\r\n" +
                "B) 8\r\n" +
                "C) 10\r\n" +
                "D) 11\r\n");
    }

    void ques3() {
        System.out.println("what is the multiplication of 4*6 ?\r\n" +
                "A) 4\r\n" +
                "B) 24\r\n" +
                "C) 10\r\n" +
                "D) 11\r\n");
    }

    void ques4() {
        System.out.println("what is the substraction of 14-6 ?\r\n" +
                "A) 4\r\n" +
                "B) 8\r\n" +
                "C) 10\r\n" +
                "D) 11\r\n");
    }

    void ques5() {
        System.out.println("what is the remainder of 10%2 ?\r\n" +
                "A) 4\r\n" +
                "B) 8\r\n" +
                "C) 5\r\n" +
                "D) 11\r\n");
    }

    // key

    char ans1 = 'c';
    char ans2 = 'a';
    char ans3 = 'b';
    char ans4 = 'b';
    char ans5 = 'c';
}
