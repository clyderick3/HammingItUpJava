package zipcode;

public class Hamming {
    int sLength;
    int s1Length;
    String thing = "";
    String thing1 = "";

    public Hamming(String s, String s1) {
        thing = s;
        thing1 = s1;
        sLength = s.length();
        s1Length = s1.length();
        if (sLength != s1Length){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {
        //Comparing two DNA strands and counting how many of the nucleotides
        // are different from their equivalent in the other string.
        int hammingDistance = 0;
        for (int i = 0; i < s1Length; i++){
            if (thing.charAt(i) != thing1.charAt(i)){
                hammingDistance++;
            }

        }

        return hammingDistance;
    }
}
