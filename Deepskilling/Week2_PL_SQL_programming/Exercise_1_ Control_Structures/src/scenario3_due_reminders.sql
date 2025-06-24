DECLARE
  v_due_date DATE;
BEGIN
  FOR loan IN (
    SELECT customer_id, due_date
    FROM loans
    WHERE due_date <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan for Customer ID ' || loan.customer_id || ' is due on ' || loan.due_date);
  END LOOP;
END;
