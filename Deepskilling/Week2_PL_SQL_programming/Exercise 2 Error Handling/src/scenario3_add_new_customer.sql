-- File: scenario3_add_new_customer.sql

CREATE OR REPLACE PROCEDURE AddNewCustomer (
  p_cust_id IN NUMBER,
  p_name    IN VARCHAR2,
  p_email   IN VARCHAR2
) IS
BEGIN
  INSERT INTO customers (customer_id, name, email)
  VALUES (p_cust_id, p_name, p_email);

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Customer added successfully');

EXCEPTION
  WHEN DUP_VAL_ON_INDEX THEN
    DBMS_OUTPUT.PUT_LINE('Error: Customer ID already exists');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Failed to add customer: ' || SQLERRM);
END;
/


-- Test the procedure
BEGIN
  AddNewCustomer(3, 'Robert Paul', TO_DATE('1962-10-15', 'YYYY-MM-DD'), 12000);
  AddNewCustomer(3, 'Duplicate User', TO_DATE('1990-01-01', 'YYYY-MM-DD'), 500); -- Should fail
END;
