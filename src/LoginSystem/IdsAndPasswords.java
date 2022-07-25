package LoginSystem;

import java.util.HashMap;

public class IdsAndPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IdsAndPasswords() {
        logininfo.put("Aman","AMAN");
        logininfo.put("kunal", "kunal123");
        logininfo.put("Amann", "Amann23");
    }

    public HashMap getLogininfo() {
        return logininfo;
    }
}
