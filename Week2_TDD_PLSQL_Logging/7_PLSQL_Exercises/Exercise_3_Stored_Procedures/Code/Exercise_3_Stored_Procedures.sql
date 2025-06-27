-- Exercise 3: Stored Procedure

CREATE OR REPLACE PROCEDURE greet_user (
  name IN VARCHAR2
)
IS
BEGIN
  DBMS_OUTPUT.PUT_LINE('Hello, ' || name || '!');
END;
/
BEGIN
  greet_user('Sombrito');
END;
/
