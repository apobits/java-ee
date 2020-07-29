package web.learning.numberquiz.mb;

import web.learning.numberquiz.utility.NumberProblem;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

@ManagedBean
@SessionScoped
public class NumberQuizMB implements Serializable {

    private List<NumberProblem> problems;

    private NumberProblem numberProblem;

    private int score;

    private int index;

    private int solution;

    private String answer;

    private ResourceBundle resourceBundle;

    public NumberQuizMB() {
	resourceBundle = ResourceBundle.getBundle("application");
	problems = constructProblems();
    }

    private List<NumberProblem> constructProblems() {
	List<NumberProblem> numberProblems = new ArrayList<>();
	numberProblems.add(new NumberProblem(Arrays.asList(3, 1, 4, 1, 5), 9));//pi
	numberProblems.add(new NumberProblem(Arrays.asList(1, 1, 2, 3, 5), 8));//fibonacci
	numberProblems.add(new NumberProblem(Arrays.asList(1, 4, 9, 16, 25), 36));//squares
	numberProblems.add(new NumberProblem(Arrays.asList(2, 3, 5, 7, 11), 13));//primes

	return numberProblems;
    }

    public NumberProblem getProblem() {
	numberProblem = problems.get(index);
	return numberProblem;
    }

    public String checkAnswer() {
	if (numberProblem.getSolution() == solution) {
	    score++;
	    answer = resourceBundle.getString("correctAnswer");
	} else {
	    answer = resourceBundle.getString("wrongAnswer");
	}
	return "";
    }

    public String nextProblem() {
	if (index == problems.size() - 1) {
	    index = -1;
	}
	numberProblem = problems.get(++index);
	return "";
    }

    public int getSolution() {
	return solution;
    }

    public void setSolution(int solution) {
	this.solution = solution;
    }

    public String getScore() {
	return resourceBundle.getString("score") + " " + score;
    }

    public String getAnswer() {
	return answer;
    }

}
