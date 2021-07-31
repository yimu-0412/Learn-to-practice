package searchGem;

import java.util.HashSet;

/**
 * @author wangyimu
 * @create 2021-07-31-22:18
 *   给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 *   S中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *  J中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是
 *  不同类型的石头。
 *
 */
public class SearchGem {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i < jewels.length();i ++){
            set.add(jewels.charAt(i));
        }

        int count = 0;
        for(char ch : stones .toCharArray()){
            if(set.contains(ch)){
                count ++;
            }
        }
        return count;
    }
}
