package comp3111.examsystem.model;

public class Grade {
    private int studentId;
    private int questionId;
    private int studentScore;

    public Grade(int studentScore) {
        this.studentScore = studentScore;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public int getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(int studentId, int questionId, int studentScore) {
        this.studentId = studentId;
        this.questionId = questionId;
        this.studentScore = studentScore;
    }
}
