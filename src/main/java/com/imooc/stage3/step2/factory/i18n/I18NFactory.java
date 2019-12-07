package com.imooc.stage3.step2.factory.i18n;

public class I18NFactory {
    public static I18N getI18NObject(String area){
        if(area.equals("china")){
            return  new Chinese();
        }else if(area.equals("USA")){
            return new English();
        }else return null;
    }
}
