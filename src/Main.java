import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        student st[] =new student[5];
        st [0]= new student("阿美", "女" ,"資工",80,70,60);
        st [1]= new student("大華", "男" ,"資傳",50,60,80);
        st [2]= new student("小明", "男" ,"資工",40,70,60);
        st [3]= new student("阿萬", "男" ,"財經",80,80,80);
        st [4]= new student("小花", "女" ,"資工",90,90,50);
        System.out.println("姓名"+"\t\t"+"性別"+"\t\t"+"系所"+"\t\t"+"英文成績"+"\t"+"國文成績"+"\t"+"數學成績");
        for (int i =0 ;i<4; i++){
            st[i].showInfo();}
        System.out.println("功能列表\n" +
                "1 查某位同學  問第n位\n" +
                "2 查全部\n" +
                "3 查某科目平均   -  1: 英文  2:國文  3:數學 \n" +
                "4 查某同學的總分與平均 問第n位同學  \n");

        Scanner scn= new Scanner(System.in);
        for (int j =0; j<5 ;j++){
            int i =scn.nextInt();
            if (i == 1) {
                System.out.println("要問第幾位");
                int how = scn.nextInt();
                if (how > 5) {
                    System.out.println("只有五個學生");
                } else {
                    System.out.println("姓名" + "\t\t" + "性別" + "\t\t" + "系所" + "\t\t" + "英文成績" + "\t" + "國文成績" + "\t" + "數學成績");
                    st[how].showInfo();

                }
            } else if (i == 2) {
                System.out.println("姓名" + "\t\t" + "性別" + "\t\t" + "系所" + "\t\t" + "英文成績" + "\t" + "國文成績" + "\t" + "數學成績");
                st[0].showInfo();
                st[1].showInfo();
                st[2].showInfo();
                st[3].showInfo();
                st[4].showInfo();
                i=0;
            } else if (i == 3) {
                System.out.println("要查哪一科");
                int which = scn.nextInt();
                if (which == 1) {
                    System.out.println("英文平均" + ":" + (st[0].getEnglish平均() + st[1].getEnglish平均() + st[2].getEnglish平均()
                            + st[3].getEnglish平均() + st[4].getEnglish平均()));
                }

                if (which == 2) {
                    System.out.println("國文平均" + ":" + (st[0].getChinese平均() + st[1].getChinese平均() + st[2].getChinese平均()
                            + st[3].getChinese平均() + st[4].getChinese平均()));
                }
                if (which == 3) {
                    System.out.println("數學平均" + ":" + (st[0].getMath平均() + st[1].getMath平均() + st[2].getMath平均()
                            + st[3].getMath平均() + st[4].getMath平均()));
                }
            } else if (i == 4) {
                System.out.println("要問第幾位");
                int how = scn.nextInt();
                if (how > 5) {
                    System.out.println("只有五個學生");
                } else {
                    System.out.println("總分" + ":" + (st[how].getEnglish() + st[how].getChinese() + st[how].getMath()));
                    System.out.println("平均" + ":" + ((st[how].getEnglish() + st[how].getChinese() + st[how].getMath()) / 3));
                    }

            }
            if (i == 5) {
                System.out.println("離開");
                break;}

        }
            }
        }


