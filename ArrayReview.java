public class ArrayReview
{

    /**
     * Write a method that will return a String with the name 
     * of each employee from a given array (separated by a space) 
     * who has been with the company for over 20 years.   
     * Assume there are no null employees in the array.
     * IMPORTANT:  Use a regular for loop. 
     */
    public static String getNames(Employee[] employees)
    {
      String answer = "";
      for(int i = 0; i < employees.length; i++) {
        if(employees[i].getYears() > 20)
          answer += employees[i].getName() + " ";
      }
      return answer;
    }

    /**
     * Suppose that nums is an array of doubles.  
     * Write a method that will find the average of 
     * only the positive numbers in the array.   
     * IMPORTANT:  Use an enhanced for loop.
     */
    public static double average(double[] nums)
    {
      double all = 0.0;
      double average = 0.0;
      double counter = 0.0;
      for (double v : nums) {
        if (v >= 0) {
          all += v;
          counter += 1.0;
        }
      }
      if (counter > 0)
        average = all/counter;
      return average;
    }
}
