Instruction for Execution:

Its a maven project hence not required to download Jar files explicitly,also all the paths are set dynamically,hence no need to change any
location path for any file all driver. Only Java should be installed along with Java path should be set properly in System and should executable for 
Maven Project.


1. What other tests would you suggest could be written? You do not need to write
them out in detail or code them.

1. Verify that when for application type single and purpose is 'Home to Live In' and dependent is more than zero the borrowing amount is displayed properly
2. Verify that when for application type Joint and purpose is 'Home to Live In' and dependent is more than zero the borrowing amount is displayed properly
3. Verify that when for application type Joint and purpose is 'Home to Live In' and dependant is zero the borrowing amount is displayed properly
4. Verify that when for application type single and purpose is 'Home to Live In' and dependent is more than zero the borrowing amount is displayed properly
5. Verify that when for application type single and purpose is 'Residential Investment' and dependent is more than zero the borrowing amount is displayed properly
6. Verify that when for application type Joint and purpose is 'Residential Investment' and dependent is more than zero the borrowing amount is displayed properly
7. Verify that when for application type Joint and purpose is 'Residential Investment' and dependant is zero the borrowing amount is displayed properly
8. erify that when for application type single and purpose is 'Residential Investment' and dependent is more than zero the borrowing amount is displayed properly
9. Verify that user is unable to proceed without providing Living expenses

** There can be few more depending upon the changes implemented by dev.

2. If this test was part of a much larger test set, how would you speed it up?

We can create many reusable functions which will calculate the borrowing amount for different conditions,and we can reuse the same.We can keep all the input values in property file inorder to reuse the 
the same

3. Sometimes UI tests can fail unpredictably. For example, the page may not have
fully loaded before test automation attempts to click a button on a webpage. How
would you improve reliability of these tests?

While initializing the browser we can add PageLoadingSTrategy value as null capabilities as a parameter. Along with that we can create a JavaScript functions
which returns document ready state, we will have a while loop added which will not break until the page loaded properly. 