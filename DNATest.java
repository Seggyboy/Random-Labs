/*Samuel Player 
10/27/22
A DNA test project
*/

class DNATest
{
   public static void main(String[] args)
   {
      System.out.println("DNA Test");
      
      String patient1 = "ACGATCGATCGATCGATGTGCAGACTAGCGATGAGCTAGCTGAGATCGGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCACGTTCGAGATCGAATCGATGCATCGCATCGACTCGATCGACTAGCGCATCAGTAGCGAT";
      String patient2 = "GATCGACTGGTCAGATGCTAGCTAGCTAGCATCGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCATCGATGCATCGCATCCGTAGATCATGACGAGACTCGATCGACTAGCGCATCAGTAGCGATTCGATGCAACTGGTCATCGCATC";
      String patient3 = "CACTGGTCATAGCTGAGATCGGATGCTAGCTAGCTAGCATCGGTACCAGTACGATCAGATCGATCGACTACGCTAGCTAGCCTAGCATCGACTGCATCGACTAGCATCGACTAGCTAAGCATCAGCTCGACTAGCATCGATGCATCACGTTCGAGATCGAGCATCGACTCGATCGACTAGCGCATCAGTAGCGATGATCGACTAGCGCATC";
     
      
      patient patientOne = new patient();
      patient patientTwo = new patient();
      patient patientThree = new patient();
      
      patientOne.DNA = patient1;
      patientTwo.DNA = patient2;
      patientThree.DNA = patient3;
      
     runTest(patientOne, 1);
     runTest(patientTwo, 2);
     runTest(patientThree, 3);
      
   }
   
   public static void runTest(patient x, int y)
   {
      System.out.println(" ");
      System.out.println("Patient " + y);
      checkP(x);
      checkR(x);
      checkT(x);
      checkL(x);
      checkW(x);
      x.callData();
   
   
   
   
   }
   
   
   public static void checkP(patient x)
   {
     int ind = x.DNA.indexOf("ACGTTCGAGATCGA");
     if (ind == -1)
     { 
     x.hasPicard = false;
     }
     else
     {
      x.hasPicard = true;
     }
   
   
   }
   
    public static void checkR(patient x)
   {
     
     int ind = x.DNA.indexOf("CGTAGATCATGACGA");
     if (ind == -1)
     { 
     x.hasRiker = false;
     }
     else
     {
      x.hasRiker = true;
     }
   
   
   }
   
     public static void checkT(patient x)
   {
     int ind = x.DNA.indexOf("GTACCAGTACGATCAG");
     if (ind == -1)
     { 
     x.hasTroi = false;
     }
     else
     {
      x.hasTroi = true;
     }
   
   
   }
   
   public static void checkL(patient x)
   {
     String check = x.DNA.substring(0,40);
     int ind = check.indexOf("GATCGATGTGCAGACTAGCGAT");
     if (ind == -1)
     { 
     x.hasLaforge = false;
     }
     else
     {
      x.hasLaforge = true;
     }
   
   
   }
   
    public static void checkW(patient x)
   {
     int ind = x.DNA.indexOf("ACTGGTCA", 40);
     if (ind == -1)
     { 
     x.hasWorf = false;
     }
     else
     {
      x.hasWorf = true;
     }
   
   
   }

}