import java.util.*;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }

        Iterator it = map.keySet().iterator();
        while(it.hasNext()) {
            int key=(int)it.next();
            if(map.get(key) == 2) list.add(key);
        }
        
        return list;
    }
}
