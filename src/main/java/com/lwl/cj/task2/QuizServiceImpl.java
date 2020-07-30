package com.lwl.cj.task2;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class QuizServiceImpl implements QuizService {

	private List<Question> questions;
	private String fileName = "/quiz.txt";

	public QuizServiceImpl() {
		questions = FileReaderUtil.loadQuestionsFromFile(fileName);
	}

	@Override
	public void startQuiz() {
		System.out.println(String.format("\nQuiz has total %d questions :", questions.size()));
		System.out.println("You quiz is going start in few seconds, Please wait.....\n");
		try (Scanner sc = new Scanner(System.in)) {
			TimeUnit.SECONDS.sleep(5);

			int totalQuestion = questions.size();
			int canswers = 0;
			for (int i = 0; i < questions.size(); i++) {

				Question question = questions.get(i);
				System.out.println("\n#"+(i + 1)+ ". " + question.getQdata()+"\n");
				for (int j = 0; j < question.getOptions().size(); j++) {
					System.out.println(j + 1 + ". " + question.getOptions().get(j));
				}
				System.out.println("Enter your answer (1 - 4) only:\n");
				int useranswer = sc.nextInt();

				if (useranswer == question.getAnswer()) {
					canswers++;
				}

			}
			showResult(totalQuestion, canswers);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void showResult(int totalQuestion, int canswers) throws InterruptedException {

		System.out.println("\nPlease wait your results are preparing... it may take few seconds....\n");
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Total Questions: " + totalQuestion);
		System.out.println("No of Corrects: " + canswers);
		System.out.println("No of wrong: " + (totalQuestion - canswers));
	}

}
