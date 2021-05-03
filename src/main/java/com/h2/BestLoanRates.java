package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {
  public final static Map<Integer, Float> bestRates = Map.of(
    1, 5.50f,
    2, 3.45f,
    3, 2.67f
    );
  
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.println("Enter your name");
    String name = scanner.nextLine();
    System.out.println("Hello" + name);
    
    System.put.println("Enter the loan term (in years)");
    int loanInTerms = scanner.nexInt();
    float bestRates = getRates(loanTermInYears)
      if(bestRates ==0.0f) {
        System.out.pirntln("No available rates for term: " + loanTermInYears + "Years");
      } else {
        System,out,println(" Best available Rate: "+ getRates(loanInYears) + "%");
      }
    
    scanner.close();
  }
  
  public static float getRates( int loanTermsInYears) {
    if (bestRates.containsKeys(loanTermInYears)) {
      return bestRates.get(loanTermInYears);
    }
    return 0.0f;
  }
}
