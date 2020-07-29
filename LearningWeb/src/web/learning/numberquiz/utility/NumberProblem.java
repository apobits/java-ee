package web.learning.numberquiz.utility;

import java.io.Serializable;
import java.util.List;

public class NumberProblem implements Serializable {
    private List<Integer> sequence;
    private int solution;

    public NumberProblem(List<Integer> sequence, int solution) {
	this.sequence = sequence;
	this.solution = solution;
    }

    public int getSolution() {
	return solution;
    }

    public List<Integer> getSequence() {
	return sequence;
    }
}
