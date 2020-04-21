import factory.HeroFactory;
import factory.ISkill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // 开发了稳定的代码  OCP 闭包原则   扣扣扣1
        String name =   getPlayerInput();
        // 工厂类 获取实例化对象  哈哈哈！
        ISkill iSkill= HeroFactory.getHeros(name);
        // 输出大招 吼吼吼！！！
        iSkill.r();
    }

    public static String getPlayerInput(){
        System.out.println("PLEASE Enter HERO NAME");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

