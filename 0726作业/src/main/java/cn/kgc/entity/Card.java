package cn.kgc.entity;

public class Card {
    //字段
    private Integer cardId;
    private String cardNumber;

    //构造方法
    public Card(Integer cardId, String cardNumber) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
    }

    public Card() {
    }

    //获取方法
    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    //字符串方法
    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
