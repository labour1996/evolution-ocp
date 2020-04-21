package factory;

import factory.hero.Dian;
import factory.hero.GX;
import factory.hero.WLS;

public class HeroFactory {

    public static ISkill getHeros(String name) throws Exception {
        ISkill iSkill;
        switch (name){
            case "GX":
                iSkill = new GX();
                break;
            case "WLS":
                iSkill = new WLS();
                break;
            case "Dian":
                iSkill = new Dian();
                break;
            default:
                throw  new Exception();
        }
        return iSkill;
    }

}
