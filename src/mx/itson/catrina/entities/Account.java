/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina.entities;

import com.google.gson.Gson;
import java.util.List;


/**
 *
 * @author sergi
 */
public class Account {

    private String account;
    private String clabe;
    private String currency;
    private Customer customer;
    private List<Transaction> transactions;
    private List<Transaction> transactionsOp;
    private String messages;
   

    public Account deserialize(String json) {
        Account account = new Account();
        try {
            account = new Gson().fromJson(json, Account.class);
        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());

        }
        return account;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public List<Transaction> getTransactionsOp() {
        return transactionsOp;
    }

    public void setTransactionsOp(List<Transaction> transactionsOp) {
        this.transactionsOp = transactionsOp;
    }

   

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Transaction> getTransaction() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transaction) {
       this.transactions = transaction;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the messages
     */
    public String getMessages() {
        return messages;
    }

}
