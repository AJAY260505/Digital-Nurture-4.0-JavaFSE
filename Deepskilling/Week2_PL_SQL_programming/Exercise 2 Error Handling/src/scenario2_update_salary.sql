-- File: scenario2_update_salary.sql

CREATE OR REPLACE PROCEDURE UpdateSalary (
  p_emp_id     IN NUMBER,
  p_percentage IN NUMBER
) IS
BEGIN
  UPDATE employees
  SET salary = salary + (salary * p_percentage / 100)
  WHERE employee_id = p_emp_id;

  IF SQL%ROWCOUNT = 0 THEN
    RAISE_APPLICATION_ERROR(-20002, 'Employee not found');
  END IF;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Salary updated successfully');
  
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error updating salary: ' || SQLERRM);
END;
/


-- Test the procedure
BEGIN
  UpdateSalary(1, 10); 
  UpdateSalary(999, 10);
END;
