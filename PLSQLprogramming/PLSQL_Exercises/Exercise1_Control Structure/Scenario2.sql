DECLARE
    CURSOR c2 IS
    SELECT CustomerID, Balance
    FROM Customers;
BEGIN
    FOR i IN c2 LOOP

        IF i.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = i.CustomerID;
        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('VIP customers updated.');
END;
/