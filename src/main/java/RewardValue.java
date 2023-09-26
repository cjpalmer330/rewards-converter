public class RewardValue{
  double cashValue, mileRewards;
  public static void main(String[] args) {

  }

  public RewardValue(int inputMiles){
    mileRewards = inputMiles;
    cashValue = mileRewards / 0.0035;
  }

  public RewardValue(double inputCashValue){
    cashValue = inputCashValue;
    mileRewards = cashValue * 0.0035;
  }
  public double getCashValue(){
    return cashValue;
  }
  
  public double getMilesValue(){
    return mileRewards;
  }

  
}
