import com.fifetoyi.salaryslipkata.Employee;
import com.fifetoyi.salaryslipkata.SalarySlip;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalarySlipKataTests {

    @Test
    public void givenEmployeeDetails_returnTrueForCorrectDetails() {
        // Given
        Employee employee = new Employee(1, "Fifetoyi", new BigDecimal(5000));

        // When
        SalarySlip salarySlip = new SalarySlip(employee);

        // Then
        assertEquals(salarySlip.monthlySalary(), 416.67);
    }
}
