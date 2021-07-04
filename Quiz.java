// import javax.swing.JOptionPane;
// public class Quiz {

// 	public static void main(String[] args) {
// 		String question = "How old are you?\n";
// 		question += "A. 13 years old\n";
// 		question += "B. 18 years old\n";
// 		question += "C. 25 years old\n";
// 		question += "D. 32 years old";
// 		String answer = JOptionPane.showInputDialog(question);
// 		answer = answer.toUpperCase();
// 		if (answer.equals("A")) {
// 			 JOptionPane.showMessageDialog(null,"Correct!");
// 		}
// 		else {
// 			JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
// 		}

// 		System.out.println(question);

// 	}

// }


import javax.swing.JOptionPane;
public class Quiz {
static int nQuestions = 0;
static int nCorrect = 0;
static String ask(String question) {
while (true) {
String answer = JOptionPane.showInputDialog(question);
answer = answer.toUpperCase();
boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));
if (valid) return answer;
JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
}
}
static void check(String question, String correctAnswer) {
nQuestions++;
String answer = ask(question);
if (answer.equals(correctAnswer)) {
JOptionPane.showMessageDialog(null,"Correct!");
nCorrect++;
} else {
JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
}
}
public static void main(String[] args) {
String question = "How old are you?\n";
question += "A. 14\n";
question += "B. 20\n";
question += "C. 18\n";
question += "D. 30\n";
question += "E. 45";
check(question,"B");
question = "What is your name?\n";
question += "A. Hilal\n";
question += "B. John\n";
question += "C. Ahmad\n";
question += "D. Mansoor\n";
question += "E. Pedro";
check(question,"D");
question = "Are you a student?\n";
question += "A. Yes I am a student\n";
question += "B. No I am a Businessman\n";
question += "C. I am not sure\n";
question += "D. No I am a teacher\n";
question += "E. Yes but not a full time student";
check(question,"E");
JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
}
}









