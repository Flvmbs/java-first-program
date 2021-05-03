package com.h2;

import java.text.DecimalFormat;

public class MortgageCalculator {
  private final long loanAmount;
  private final int termInYears;
  private final float annualRate;
  
    public MortgageCalculator(long loanAmount, int termInYears, float annualRate {
      this.loanAmount = loanAmount;
      this.termInYears = termInYears;
      this.annualRate = annualRate;
    }
        
   private int getNumberOfPayments() {
     return this.termInYears * 12;
   }
 
 private float getMonthlyInterestRate() {
   float interestRate = annualRate / 100;
   return interestRate / 12;
 }
                              
public double gentMonthyPayment() {
  long P = loanAmount;
  float r = getMonthlyInterestRate();
  int n = getNumberOfPayments();
  
  system.out.println("P=" + P);
    system.out.println("r=" + r);
    system.out.println("n=" + n);
  double M = P * ((( r * Math.pow(1 + r, n ))) / ((Math.pow((1 + r), n)) - 1));
  
  return M;
}
                              
  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>");
      System.exit(-1);
    }
    
    final long loanAmount = Utilities.getLongValue(args[0]);
    final int termInYears = Utilities.getLongValue(args[1]);
    final float annualRate = Utilities.getLongValue(args[2]);
    final MortgageCalculator c = new Mortgage Calculator( loanAmount, termInYears, annualRate);
    final double monthlyPayment = c.getMonthlyPayment();
    DecimalFormat df = new DecimalFormat("####0.00");
    
    System.out.println("Monthly Payment: " + df.format(monthlyPayment));
  }
}                              
