public class StringFormatTest {
    public static void main(String[] args) {

        int userNum = 100;
        String oldNickName="ytest";
        //默认格式化规则
        String str="%01d";

        int len=String.valueOf(userNum).length();
        //昵称格式化规则
        str = "%0" + (len) + "d";
        System.out.println(str);
        for (int i = 0; i < userNum; i++) {
            String nickname = oldNickName + String.format(str,i + 1);
            System.out.println(nickname);
        }
        //master1
    }

}
