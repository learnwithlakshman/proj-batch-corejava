package com.lwl.cj.task2;

public class QuizManager {

		public static void main(String[] args) {
			QuizService service = new QuizServiceImpl();
			service.startQuiz();
		}
}
