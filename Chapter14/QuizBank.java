public class QuizBank {

	private static final int waiting = 0;
	private static final int problem = 1;
	private static final int answer = 2;
	private static final int numproblems = 3;

	private int state = waiting;

	private String[] problems = { "네트워크 처리 패키지는?", "서버쪽 소켓 클래스는?", "인터넷에서 컴퓨터를 식별하는 주소는?" };

	private String[] answers = { "java.net", "ServerSocket", "IP주소" };
	private String coutput;
	private int currentProblem = 0;

	public String process(String cinput) {// null,y,java.util,y(n)

		if (state == waiting) {
			coutput = "퀴즈를 시작합니다.(y/n):";
			state = problem;
		} else if (state == problem) {
			if (cinput.equals("y")) {
				// 문제를 보내는 기능
				coutput = problems[currentProblem];
				state = answer;
			} else {
				coutput = "quit";
			}
		} else if (state == answer) {
			if (cinput.equals(answers[currentProblem])) {
				coutput = "정답입니다. 계속(y/n):";
				state = problem;
			} else {
				coutput = "오답입니다. 계속(y/n):";
				state = problem;
			}
			currentProblem = (currentProblem + 1) % numproblems; // 0,1,2 3
		}

		// 답을 확인해보는 기능

		// 정답(y/n)/오답(y/n)
		return coutput;
	}

}