package 扑克牌游戏;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Card {
    private int rank;//花面值
    private String suit;//花色

    public Card(int rank, String suits) {
        this.rank = rank;
        this.suit = suits;
    }
    @Override
    public String toString() {
        return "[" +
                "数值=" + rank +
                ", 花色='" + suit + '\'' +
                ']';
    }
}
class Desk {
    public static String[] suits = {"♥","♠","♣","♦"} ;
    public List<Card> buydesk(){
        List<Card> desk = new ArrayList<>();
        for(int i = 0; i < 4; i ++){
            for(int j = 1;j <= 13; j ++){
                int rank = j;
                String suit = suits[i];
                Card card = new Card(rank,suit);
                desk.add(card);
            }
            //System.out.println(desk);
        }
        return desk;
    }

    //交换方法
    public void swap(List<Card> desk,int i, int index) {
        Card tmp = desk.get(i);
        desk.set(i, desk.get(index));
        desk.set(index,tmp);
    }

    public void shffle(List<Card> desk){
        int len = desk.size();
        for(int i = len - 1;i > 0;i --){
            Random random = new Random();
            int index = random.nextInt(i);
            swap(desk,i,index);
        }

    }
}

public class DeskGame {
    public static void main(String[] args) {
        Desk desk1 = new Desk();
        List<Card> desk2 = desk1.buydesk();//创建新牌
        System.out.println(desk2);

        System.out.println("洗牌");
        desk1.shffle(desk2);
        System.out.println(desk2);

        System.out.println("玩游戏 ====》揭牌");

        ArrayList<Card> hand1 = new ArrayList<>();
        ArrayList<Card> hand2 = new ArrayList<>();
        ArrayList<Card> hand3 = new ArrayList<>();

        ArrayList< ArrayList<Card>> hand = new ArrayList<>();
        hand.add(hand1);
        hand.add(hand2);
        hand.add(hand3);

        // j ---> 三个人，每个人轮流抓5张牌
        for(int i = 0; i < 5; i ++){
            for(int j = 1;j < 3; j ++){
                Card card = desk2.remove(0);
                hand.get(j).add(card);
            }
        }
        for(int i = 0; i < 3; i ++){
            System.out.println(hand.get(i));
        }
    }
}