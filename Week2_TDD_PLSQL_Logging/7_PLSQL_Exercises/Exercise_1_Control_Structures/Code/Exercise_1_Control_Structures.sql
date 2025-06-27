DECLARE
  num NUMBER := 7;
BEGIN
  IF MOD(num, 2) = 0 THEN
    DBMS_OUTPUT.PUT_LINE('Even');
  ELSE
    DBMS_OUTPUT.PUT_LINE('Odd');
  END IF;
END;
