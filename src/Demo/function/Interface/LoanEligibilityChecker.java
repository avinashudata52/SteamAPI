package Demo.function.Interface;
import java.util.function.Predicate;

public class LoanEligibilityChecker {
    
    interface IncomeEligibility extends Predicate<Double> {}
    interface JobTypeEligibility extends Predicate<String> {}
    interface ResidenceEligibility extends Predicate<String> {}    
    interface ITREligibility extends Predicate<Boolean> {}
    interface CreditScoreEligibility extends Predicate<Integer> {}

    // Implement the eligibility check method
    public boolean checkEligibility(
            double income, 
            String jobType, 
            String residence, 
            boolean itrStatus, 
            int creditScore) {
        
        IncomeEligibility incomeCheck = i -> i > 30;
        JobTypeEligibility jobTypeCheck = jt -> jt.equalsIgnoreCase("permanent");
        ResidenceEligibility residenceCheck = r -> r.equalsIgnoreCase("India");
        ITREligibility itrCheck = itr -> itr;
        CreditScoreEligibility creditScoreCheck = cs -> cs >= 700; 
        return incomeCheck.test(income) &&
                jobTypeCheck.test(jobType) &&
                residenceCheck.test(residence) &&
                itrCheck.test(itrStatus) &&
                creditScoreCheck.test(creditScore);
    }

  class Demo{
    public static void main(String[] args) 
    {
        LoanEligibilityChecker checker = new LoanEligibilityChecker();
        
        // Test data
        double income = 50;
        String jobType = "Permanent";
        String residence = "India";
        boolean itrStatus = true;
        int creditScore = 750;

        boolean isEligible = checker.checkEligibility(income, jobType, residence, itrStatus, creditScore);
        
        if (isEligible) {
            System.out.println();
            System.out.println("You are eligible for the personal loan.");
        } 
        else
        {
        	System.out.println("You are not eligible for loan");
        }
        	
  		}
    }
