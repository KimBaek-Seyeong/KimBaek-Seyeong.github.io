public class QuizBank {

	private static final int waiting = 0;
	private static final int problem = 1;
	private static final int answer = 2;
	private static final int numproblems = 3;

	private int state = waiting;

	private String[] problems = { "��Ʈ��ũ ó�� ��Ű����?", "������ ���� Ŭ������?", "���ͳݿ��� ��ǻ�͸� �ĺ��ϴ� �ּҴ�?" };

	private String[] answers = { "java.net", "ServerSocket", "IP�ּ�" };
	private String coutput;
	private int currentProblem = 0;

	public String process(String cinput) {// null,y,java.util,y(n)

		if (state == waiting) {
			coutput = "��� �����մϴ�.(y/n):";
			state = problem;
		} else if (state == problem) {
			if (cinput.equals("y")) {
				// ������ ������ ���
				coutput = problems[currentProblem];
				state = answer;
			} else {
				coutput = "quit";
			}
		} else if (state == answer) {
			if (cinput.equals(answers[currentProblem])) {
				coutput = "�����Դϴ�. ���(y/n):";
				state = problem;
			} else {
				coutput = "�����Դϴ�. ���(y/n):";
				state = problem;
			}
			currentProblem = (currentProblem + 1) % numproblems; // 0,1,2 3
		}

		// ���� Ȯ���غ��� ���

		// ����(y/n)/����(y/n)
		return coutput;
	}

}