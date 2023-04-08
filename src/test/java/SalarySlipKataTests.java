import com.fifetoyi.salaryslipkata.Employee;
import com.fifetoyi.salaryslipkata.SalarySlip;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SalarySlipKataTests {

    @Test
    public void givenValidEmployee_generateSlip_returnsValidMonthlySalary() throws Exception {
        // Given
        var employee = new Employee(1, "Fifetoyi", new BigDecimal(5000));

        // When
        var salarySlip = new SalarySlip(employee);

        // Then
        var actual = salarySlip.monthlySalary();
        var expected = new BigDecimal("416.67");
        assertEquals(actual, expected);
    }

    @Test
    public void givenValidEmployeeWithNegativeSalary_generateSlip_throwsException() throws Exception {
        // Given
        var employee = new Employee(1, "Fifetoyi", new BigDecimal(-1));

        // When
        var salarySlip = new SalarySlip(employee);

        // Then
        assertThrows(Exception.class, salarySlip::monthlySalary);
    }

    @Test
    public void givenValidEmployeeWithZeroSalary_generateSlip_returnsZero() throws Exception {
        // Given
        var employee = new Employee(1, "Fifetoyi", new BigDecimal("0"));

        // When
        var salarySlip = new SalarySlip(employee);

        // Then
        var actual = salarySlip.monthlySalary();
        var expected = new BigDecimal("0.00");
        assertEquals(actual, expected);
    }

    @Test
    public void givenValidEmployeeWithValidSalary_generatesSlip_returnsValidNationalInsuranceContribution() throws Exception {
        // Given
        var employee = new Employee(1, "Fifetoyi", new BigDecimal("9060"));

        // When
        var salarySlip = new SalarySlip(employee);

        // Then
        var actual = salarySlip.nationalInsurance();
        var expected = new BigDecimal("10.00");
        assertEquals(actual, expected);
    }

    @Test
    public void givenValidEmployeeWithSalaryAtThreshold_generatesSlip_returnsZeroNationalInsuranceContribution() {
        // Given
        var employee = new Employee(1, "Fifetoyi", new BigDecimal("8060"));

        // When
        var salarySlip = new SalarySlip(employee);

        // Then
        var actual = salarySlip.nationalInsurance();
        var expected = new BigDecimal(0);
        assertEquals(expected, actual);
    }

    @Test
    public void givenValidEmployeeWithSalaryBelowThreshold_generatesSlip_returnsZeroNationalInsuranceContribution() throws Exception {
        // Given
        var employee = new Employee(1, "Fifetoyi", new BigDecimal("1"));

        // When
        var salarySlip = new SalarySlip(employee);

        // Then
        var actual = salarySlip.nationalInsurance();
        var expected = new BigDecimal(0);
        assertEquals(expected, actual);
    }
}
