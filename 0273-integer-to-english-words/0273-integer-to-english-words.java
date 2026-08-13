class Solution {
    public String numberToWords(int n) {
          String[] ones = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"
        };

        String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy",
            "Eighty", "Ninety"
        };

        if(n==0) return "Zero";
        if(n<20) return ones[n];
        if(n<100) return tens[n/10]+(n%10==0?"":" "+numberToWords(n%10));
        if(n<1000) return numberToWords(n/100)+" Hundred"+(n%100==0?"":" "+numberToWords(n%100));
        if(n<1000000) return numberToWords(n/1000)+" Thousand"+(n%1000==0?"":" "+numberToWords(n%1000));
        if(n<1000000000) return numberToWords(n/1000000)+" Million"+(n%1000000==0?"":" "+numberToWords(n%1000000));

        return numberToWords(n/1000000000)+" Billion"+(n%1000000000==0?"":" "+numberToWords(n%1000000000));
    }
}