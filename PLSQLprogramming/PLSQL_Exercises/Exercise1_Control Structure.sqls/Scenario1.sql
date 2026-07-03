DECLARE
    CURSOR c1 IS
    SELECT c.CustomerID, c.DOB, l.LoanID
    FROM Customers c, Loans l
    WHERE c.CustomerID = l.CustomerID;

    v_age NUMBER;
BEGIN
    FOR i IN c1 LOOP

        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, i.DOB) / 12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = i.LoanID;
        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Loan interest updated.');
END;
/