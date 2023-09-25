public class RewardValue{
  double cashValue, mileRewards;
  public static void main(String[] args) {

  }

  public RewardValue(int inputMiles){
    mileRewards = inputMiles;
  }

  public RewardValue(double inputCashValue){
    cashValue = inputCashValue;
  }
  public double getCashValue(){
    return mileRewards / 0.0035;
  }
  
  public double getMilesValue(){
    return cashValue * 0.0035;
  }

  
}
