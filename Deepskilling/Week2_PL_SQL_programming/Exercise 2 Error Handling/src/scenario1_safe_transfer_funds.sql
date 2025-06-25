-- File: scenario1_safe_transfer_funds.sql

CREATE OR REPLACE PROCEDURE SafeTransferFunds (
  p_from_acc IN NUMBER,
  p_to_acc   IN NUMBER,
  p_amount   IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  -- Check balance
  SELECT balance INTO v_balance FROM accounts WHERE account_id = p_from_acc;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds');
  END IF;

  -- Begin transfer
  UPDATE accounts SET balance = balance - p_amount WHERE account_id = p_from_acc;
  UPDATE accounts SET balance = balance + p_amount WHERE account_id = p_to_acc;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Transfer successful');
  
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/
