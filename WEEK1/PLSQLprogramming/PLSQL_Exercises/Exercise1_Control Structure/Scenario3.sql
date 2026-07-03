DECLARE
    CURSOR c3 IS
    SELECT c.Name, l.EndDate
    FROM Customers c, Loans l
    WHERE c.CustomerID = l.CustomerID
    AND l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN

    FOR i IN c3 LOOP

        DBMS_OUTPUT.PUT_LINE('Reminder for ' || i.Name);
        DBMS_OUTPUT.PUT_LINE('Loan Due Date : ' || i.EndDate);

    END LOOP;

END;
/