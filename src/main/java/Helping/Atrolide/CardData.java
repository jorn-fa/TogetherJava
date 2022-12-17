package Helping.Atrolide;

public class CardData implements Comparable<CardData>{
    String cardNumber;
    int pinCode;

    public CardData(String cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public int getPinCode() {
        return pinCode;
    }

    @Override
    public String toString() {
        return "CardData{" +
                "cardNumber='" + cardNumber + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }

    @Override
    public int compareTo(CardData o2) {
        return Integer.compare(getPinCode(), o2.getPinCode());
    }
}
