# Employee Database User Guide

The Employee Database can be used by companies and businesses to manage employee data in a secure and efficient manner. Users are able to add, search, remove, and display employees through the employee database, and all information can be saved (and will be stored in a .txt file).

When adding or editing an employee, the following attributes are used:

- Employee Number (**must be unique for each employee)**
- First Name
- Last Name
- Gender
- Work Location
- Deduction Rate
- Employee Type (Part-Time vs Full-Time)

Depending on the Employee Type selected, additional attributes are available: hourly wage, hours worked/week, and weeks worked/year for **part-time;** yearly salary is available for **full-time** employees.

## Landing Page
![alt text] (https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/Landing%20Page.png)

Upon opening the Employee Database, you will be brought to this frame. If you already have previous data that you would like to import, ensure that the .txt file is placed in the Employee Database Folder. From there, you can click Load from Text File (bottom left of screen), and then refresh (bottom right corner) to display the employees.

## Add Employee

When adding a new employee, all information below must be filled out. Employee Number must be an integer, while Deduction Rate can contain decimals.

![alt text](https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/Add%20Employee.png)

The Part-Time and Full-Time tabs start off disabled until you press the radio button. After the Part-Time button is selected, the Part-Time Tab becomes enabled, disabling the other tabs.

![alt text](https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/PartTime.png)

On the other hand, if the Full-Time tab is selected, it&#39;s respective tab becomes enabled, disabling the other tabs.

![alt text](https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/FullTime.png)

If you try to add an employee without filling out all required fields, the following error message will be displayed:

![alt text](https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/EntriesMissing.png)

If you attempt to add an employee when another employee with the same employee number exists, another error message will be displayed, reminding you to change your employee number.

![alt text](https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/EmployeeExists.png)

Finally, if one of the inputs are of the wrong type, an error message will be displayed as well.

![alt text](https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/EntryError.png)

## Search Employee

![alt text](https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/SearchEmployee.png)

When searching for an employee, you must input the employee number for the employee that you are looking for, and then click the search button.

In the case the employee number is not in the system (the employee does not exist), an error message will be displayed.

![alt text](https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/SearchError.png)

If an employee is found, a new frame will appear, where you can view, edit, or delete the employee.

![alt text](https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/EditEmployee.png)

From this panel, you can freely edit all parts of the employee. To save your changes, you can hit the save button at the bottom. Otherwise, to discard your changes and stay with the previously saved information, you can hit the Close (X button) at the top right corner. Furthermore, you can hit the delete button the delete the employee from the system.

Again, all error messages shown in the Add Employee Section will also apply here.

## Display Employees

![alt text](https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/DisplayEmployee.png)

The employees are displayed in the order they are added to the database. By clicking on the either Employee Number, First Name, or Last Name, you can sort the table by the respective fields.

_Example: Sorting by Employee Number_

![alt text](https://github.com/YinuoWang/Employee-Database/blob/master/Pictures/DisplayEmployeeSorted.png)

Clicking again will sort by descending order.

Clicking on a row will similarly bring you to an edit frame (same as the one shown from the search).