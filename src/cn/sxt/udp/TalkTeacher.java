package cn.sxt.udp;
//加入多线程，实现双向交流，模拟在线咨询
public class TalkTeacher {
    public static void main(String[] args) {
        new Thread(new TalkReceive(9999,"学生说")).start();//接收
        new Thread(new TalkSend(8101,"localhost",8888)).start();//发送

    }
}
