package zipcode;

public class Hamming {
    public Hamming(String s, String s1) {
        int sLength = s.length();
        int s1Length = s1.length();
        if (sLength != s1Length){
            throw new IllegalArgumentException("The two strands MUST be of equal length!")
        }
    }

    public int getHammingDistance() {
        //Comparing two DNA strands and counting how many of the nucleotides
        // are different from their equivalent in the other string.

        return -1;
    }
}
