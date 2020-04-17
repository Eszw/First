package webadv.s99201105.p02;
import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        Scanner a = new Scanner(System.in);
        String no1 = "17201126";
        String sn1 = "yzw";
        String no = null;
        String sn = null;
        System.out.println("请输入账号");
        no = a.nextLine();
        System.out.println("请输入密码");
        sn = a.nextLine();
        if((no.equals(no1)==true)&&(sn.equals(sn1)==true)){
            System.out.println("登录成功");
        }else{
        System.out.println("登录失败");

    }
}
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
