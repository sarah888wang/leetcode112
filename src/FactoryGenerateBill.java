import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryGenerateBill {
    public static void main(String[] args) throws IOException {
        FactoryGetPlanFactory planFactory = new FactoryGetPlanFactory();
        System.out.println("Enter the name of plan for which the bill will be generated:" );

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName=br.readLine();
        System.out.println("Enter the number of units for bill will be calculated: ");

        int units=Integer.parseInt(br.readLine());

        //**********FactoryPlan*******planFactory
        FactoryPlan p = planFactory.getPlan(planName);

        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);
    }

}
