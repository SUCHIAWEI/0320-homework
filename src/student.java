public class student {
    private String name;
    private String sex;
    private String department ;
    private int english ,chinese , math;
    public student(String name1, String sex1,String department1,int english1, int chinese1,int math1){
        name =name1; sex = sex1; department = department1; english = english1; chinese = chinese1; math = math1;
    }
    public void  showInfo(){
        System.out.println(this.name+"\t\t"+this.sex+"\t\t"+this.department+"\t\t\t"+this.english+"\t\t"+this.chinese+"\t\t"+this.math);
    }
    public  int getEnglish平均(){return english/5;}
    public  int getChinese平均(){return chinese/5;}
    public  int getMath平均(){return math/5;}
    public  int getEnglish(){return english;}
    public  int getChinese(){return chinese;}
    public  int getMath(){return math;}

}
