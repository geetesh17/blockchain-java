package geetesh;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Geetesh {

    private int prehash;
    private String[] transn;

    private int bhash;

    public Geetesh(int previousHash, String[] transactions) {
        this.prehash = previousHash;
        this.transn = transactions;

        Object[] contens = {Arrays.hashCode(transactions), previousHash};
        this.bhash = Arrays.hashCode(contens);

    }

    public int getPreviousHash() {
        return prehash;
    }

    public String[] getTransaction() {
        return transn;
    }

    public int getBlockHash() {
        return bhash;
    }
    
  public static void main(String[] args) {

        String[] genesisTransactions = {"Geetesh","Jayesh"};
        Geetesh genesisBlock = new Geetesh(0, genesisTransactions);

        String[] block2Transactions = {"Ritesh", "Rushikesh"};
        Geetesh block2 = new Geetesh(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"Shubham"};
        Geetesh block3 = new Geetesh(block2.getBlockHash(), block3Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

    }
}
