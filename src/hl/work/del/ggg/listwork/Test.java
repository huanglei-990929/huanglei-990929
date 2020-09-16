package hl.work.del.ggg.listwork;


import java.util.ArrayList;
import java.util.Scanner;

public  class Test {

    public static void main(String[] args) {
        Users users1 = new Users("蒋凯文", 111);
        Users users2 = new Users("黄磊", 111);
        Users users3 = new Users("陈钟", 111);
        Users users4 = new Users("陈好", 111);
        Users users5 = new Users("啦啦啦", 111);
        ArrayList<Users> list = new ArrayList<Users>();
        list.add(users1);
        list.add(users2);
        list.add(users3);
        list.add(users4);
        list.add(users5);
        Scanner input=new Scanner(System.in);
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        A:for(int i=0;i<3;i++){
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();
            B:for (Users user : list) {
                if(name.equals(user.getName()) && pwd.equals(user.getPassword())){
                    System.out.println("恭喜你，登录成功！");
                    flag = true;
                    break A;
                }
            }
        }

        if(!flag){
            System.out.println("登录失败，下次再来！");
        }

    }
    }



