public class Dns {
    public String dnaToRna(String dna) {
        if (dna.contains("T")) dna = dna.replaceAll("T", "U");
        return dna;
    }
}

