
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(euros + addition.euros, cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (euros < compared.euros()) {
            return true;
        } else if (euros == compared.euros && cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        Money newMoney;
        if (this.lessThan(decreaser)) {
            newMoney = new Money(0,0);
        } else {
            int newCents = (100 * euros + cents) - (100 * decreaser.euros + decreaser.cents);
            newMoney = new Money(newCents / 100, newCents % 100);
        }
        return newMoney;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
