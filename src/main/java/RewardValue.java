public class RewardValue
{
    
    double milesValue = 0;
    double cashValue = 0;

    public RewardValue(double cash) {
        cashValue = cash
        setMiles();
    }

    public RewardValue(int miles) {
        milesValue = miles;
        setCash();
    }
    
    private void setCash(double cash) {
        cashValue = milesValue/0.0035;
    }
    
    private void setMiles (){
        milesValue = cashValue*0.0035;
}

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {

        return milesValue;
    }
}
