package demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * point:业务和界面分离(此为界面)
 */
public class Layout {

    private static final Logger log = LoggerFactory.getLogger(Layout.class);

    @SuppressWarnings("all")
    public static void main(String[] args) {
        try {
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入第一个数字:");
            String str1 = console.readLine();
            Double numberA = Double.valueOf(str1);
            System.out.println("输入第二个数字:");
            String str2 = console.readLine();
            Double numberB = Double.valueOf(str2);
            System.out.println("输入操作符:");
            String str3 = console.readLine();
            String operate = str3;
            double result = Operation.GetResult(numberA, numberB, operate);
            System.out.println("result = " + result);
        } catch (Exception e ) {
            log.error("输入有误: {}",e.getMessage());
        }
    }
}
