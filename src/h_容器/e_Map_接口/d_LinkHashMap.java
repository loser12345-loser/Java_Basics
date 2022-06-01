package h_容器.e_Map_接口;

import java.util.LinkedHashMap;

//容器中存取元素是有序的
public class d_LinkHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("a","aa");
        lhm.put("b","bb");
        lhm.put("c","cc");
        for (String s : lhm.keySet()) {
            System.out.println(s+"--"+ lhm.get(s));
        }

    }

}
