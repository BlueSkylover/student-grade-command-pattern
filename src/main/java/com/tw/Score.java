package com.tw;

public class Score {
    String math;
    String chinese;
    String english;
    String programming;
    public  Score(String string){
        String[] subject=string.split(",");
        String[] subject_score=subject[0].split(":");
        this.math= subject_score[1];
        subject_score=subject[1].split(":");
        this.chinese=subject_score[1];
        subject_score=subject[2].split(":");
        this.english=subject_score[1];
        subject_score=subject[3].split(":");
        this.programming=subject_score[1];
    }

    public String getMath() {
        return math;
    }

    public String getChinese() {
        return chinese;
    }

    public String getEnglish() {
        return english;
    }

    public String getProgramming() {
        return programming;
    }

        public double getAverageScore(){

        return (Double.valueOf(math)+ Double.valueOf(chinese)+Double.valueOf(english)+Double.valueOf(programming))/4.0;
    }
    public double getTotalScore(){
        return(Double.valueOf(math)+ Double.valueOf(chinese)+Double.valueOf(english)+Double.valueOf(programming));
    }

}
