package com.tw;

public class Student {
    String name;  //姓名
    String sno; //学号
    String nationality;//民族
    String klass;//班级
    Score score;//学科成绩


    public  Student(String name, String sno,String nationality,String klass,Score score){
        this.name=name;
        this.sno=sno;
        this.nationality=nationality;
        this.klass=klass;
        this.score=score;

    }

    public String getName() {
        return name;
    }

    public String getKlass() {
        return klass;
    }

    public String getSno() {
        return sno;
    }

    public String getNationality() {
        return nationality;
    }

    public Score getScore() {
        return score;
    }

    public String printStuInfo(){
        String stu=name+','+sno+','+nationality+','+klass+','+score;
        return  stu;
//        System.out.println(name+','+sno+','+nationality+','+klass+','+score);
    }

}
