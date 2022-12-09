public class patient
{
   String DNA = " ";
   boolean hasPicard = false;
   boolean hasRiker = false;
   boolean hasTroi = false;
   boolean hasLaforge = false;
   boolean hasWorf = false;
      
      public void callData()
      {
         System.out.println("Patient has Picard Syndrome? " + hasPicard);
         System.out.println("Patient has Riker Syndrome? " + hasRiker);
         System.out.println("Patient has Troi Syndrome? " + hasTroi);
         System.out.println("Patient has Laforge Syndrome? " + hasLaforge);
         System.out.println("Patient has Worf Syndrome? " + hasWorf);
       
      }


}