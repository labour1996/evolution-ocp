package factory.hero;

import factory.ISkill;

public class Dian implements ISkill {
    @Override
    public void q() {
        System.out.println("q");
    }

    @Override
    public void w() {
        System.out.println("w");
    }

    @Override
    public void e() {
        System.out.println("e");
    }

    @Override
    public void r() {
        System.out.println("r");
    }
}
