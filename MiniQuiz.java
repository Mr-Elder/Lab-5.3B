//********************************************************************
//  MiniQuiz.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a class that implements an interface.
//********************************************************************
public class MiniQuiz
{
   //-----------------------------------------------------------------
   //  Presents a short quiz.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Question q1, q2;
      String possible;

      q1 = new Question ("What is the capital of Jamaica?",
                         "Kingston");
      q1.setComplexity (4);

      q2 = new Question ("Which is worse, ignorance or apathy?",
                         "I don't know and I don't care");
      q2.setComplexity (10);
      
      askQuestion(q1);
      askQuestion(q2);
   }
   
   private static void askQuestion(Question question){
   		if(question.answerCorrect(GetInfo.getString(question.getQuestion() + " with complexity level " + question.getComplexity())))
   			GetInfo.showMessage("The answer was correct");
   		else GetInfo.showMessage("Incorrect! The answer was : " + question.getAnswer());
   		
   		
   }
   
}
