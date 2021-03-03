package sample;

public class StudentRecord {
    String studentID;
    float assignments;
    float midterm;
    float exam;
    float finalMark;
    String letterGrade;

    public StudentRecord(String s, float v, float v1, float v2) {
        this.studentID = s;
        this.assignments = v;
        this.midterm = v1;
        this.exam = v2;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public float getAssignments() {
        return this.assignments;
    }

    public float getExam() {
        return this.exam;
    }

    public float getMidterm() {
        return this.midterm;
    }

    public float getFinalMark() {
        float mark_final = (20 * this.assignments + 30 * this.midterm + 50 * this.exam) / (20 + 30 + 50);
        this.finalMark = mark_final;
        return this.finalMark;
    }

    public String setLetter() {
        int mark = ((int) getFinalMark());
        if (mark >= 0 && mark <= 49) {
            return "F";
        } else if (mark > 49 && mark <= 59) {
            return "D";
        } else if (mark > 59 && mark <= 69) {
            return "C";
        } else if (mark > 69 && mark <= 79) {
            return "B";
        } else if (mark > 79 && mark <= 100) {
            return "A";
        }
        return "error";

    }
    public String getLetterGrade(){
        return this.letterGrade=setLetter();
    }

}

