package com.lwl.cj.task2;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class FileReaderUtil {

	private FileReaderUtil() {
	}

	public static List<Question> loadQuestionsFromFile(String fileName) {
		List<Question> questions = new ArrayList<>();
		URL url = FileReaderUtil.class.getResource(fileName);
		String path = url.getPath();
		try {
			List<String> list = Files.readAllLines(Paths.get(path.substring(1)));

			for (int i = 0; i < list.size(); i++) {
				Question question = getQuestion(list.subList(i, i + 7));
				i += 6;
				questions.add(question);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return questions;
	}

	private static Question getQuestion(List<String> list) {
		int i = 0;
		int id = Integer.parseInt(list.get(i++).substring(1));
		String qdata = list.get(i++);
		List<String> options = new ArrayList<String>();
		options.add(list.get(i++));
		options.add(list.get(i++));
		options.add(list.get(i++));
		options.add(list.get(i++));
		int answer = Integer.parseInt(list.get(i++).substring(4));
		Question question = Question.builder().id(id).qdata(qdata).options(options).answer(answer).build();
		return question;
	}

}
