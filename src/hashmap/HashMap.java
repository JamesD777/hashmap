package hashmap;

/**
 *
 * @author jcd4912
 */
public class HashMap {

    /**
     * @param args the command line arguments
     */
    static int[] hashtable = new int[9];

    /**
     *load value for the hash table
     */
    public static final double load = .5;
    
    public static void main(String[] args) {
        hash(101);
        hash(108);
        hash(112);
        hash(115);
        hash(126);
        hash(173);
        hash(854);
        hash(307);
        hash(186);

        for(int i = 0; i < hashtable.length; i++)
            System.out.println(hashtable[i]);
    }

    public static void hash(int key){
        int hash = Math.abs(key % hashtable.length);
        if(hashtable[hash] == 0)
            hashtable[key % hashtable.length] = key;
        else{
            int j = 1;
            hash = (key + j * j) % hashtable.length;
            while(hashtable[hash] != 0){
                if(j > hashtable.length*50){
                    System.out.println("Cant put key in table quadratically");
                    j = 0;
                    while(hashtable[hash] != 0){//loop linearly till open space found and put the key there
                        j++;
                        hash = j-1;
                    }
                    break;
                }
                j++;
                hash += ( key + j * j ) % hashtable.length;
                while(hash > hashtable.length-1)
                    hash -= hashtable.length;
            }
            hashtable[hash] = key;
        }
        resizeArray();
    }

    public static void resizeArray(){
        int[] temp = hashtable;
        float amountFilled = 0;
        for(int i = 0; i < hashtable.length; i++)
            if(hashtable[i] != 0)
                amountFilled++; 
        if(amountFilled/hashtable.length >= load){
            hashtable = new int[hashtable.length*2];
            for(int i = 0; i < temp.length; i++)
                if(temp[i] != 0)
                    hash(temp[i]);    
        }
    }
}
