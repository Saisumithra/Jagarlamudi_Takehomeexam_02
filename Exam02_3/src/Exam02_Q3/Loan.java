/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exam02_Q3;
import java.util.Date;
/**
 *
 * @author Saisumithra Jagarlamudi
 */
public class Loan {
       
	private int loanAmount;

    public Loan(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    @Override
    public String toString() {
        return "LoanAmount=" + loanAmount ;
    }
}

    
	

	