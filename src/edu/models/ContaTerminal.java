package edu.models;


public class ContaTerminal {
    private int accoutNumber;
    private String agency;
    private String clientName;
    private float balance;

    // Getter and Setter to accoutNumber
    public int getAccoutNumber() {
        return accoutNumber;
    }

    public void setAccoutNumber(int accoutNumber) {
        this.accoutNumber = accoutNumber;
    }

    // Getter and Setter to agency
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    // Getter and Setter to clientName
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    // Getter and Setter to balance
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
