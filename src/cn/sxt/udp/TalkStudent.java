package cn.sxt.udp;
//加入多线程，实现双向交流，模拟在线咨询
public class TalkStudent {
    public static void main(String[] args) {
        new Thread(new TalkSend(8100,"localhost",9999)).start();//发送
        new Thread(new TalkReceive(8888,"老师说")).start();//接收
    }
}
