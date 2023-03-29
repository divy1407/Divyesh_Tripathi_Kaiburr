# Divyesh_Tripathi_Kaiburr

*TASK 1: Java REST API example.*

Implement an application in java which provides a REST API with endpoints for searching, creating and deleting “server” objects:

1. GET servers. Should return all the servers if no parameters are passed. When server id is passed as a parameter - return a single server or 404 if there’s no such a server. 

2.  PUT a server. The server object is passed as a json-encoded message body. Here’s an example: 
{ 
“name”: ”my centos”, 
“id”: “123”, 
“language”:”java”, 
“framework”:”django” 
} 

3. DELETE a server. The parameter is a server ID.

4. GET (find) servers by name. The parameter is a string. Must check if a server name contains this string and return one or more servers found. Return 404 if nothing is found. “Server” objects should be stored in MongoDB database. 

Be sure that you can show how your application responds to requests using postman, curl or any other HTTP client


*************************************************************************************


Frist of all we have to post the record in the server using POSTMAN which can be used to write functional tests, integration tests, regression tests, and more:

Record of Emp_1 in POSTMAN
![image](https://user-images.githubusercontent.com/63108640/228601888-15da322a-6657-45f9-acc7-93a1de437c47.png)
Record of Emp_2 in POSTMAN
![image](https://user-images.githubusercontent.com/63108640/228602089-1823e027-cfdc-4816-b515-849a55c4a223.png)

Now we can view the records in MONGODB:
![image](https://user-images.githubusercontent.com/63108640/228602784-7d1d3ce2-e96d-4e92-bdf8-6f239bd8bd2f.png)

**********************************************

Solution 1:

Getting the record of all empployees if no parameter in passed:
![image](https://user-images.githubusercontent.com/63108640/228603763-92e0a84c-2f87-45ab-a0e7-8de9e4f636e1.png)

Now, employee ID is passed:
![image](https://user-images.githubusercontent.com/63108640/228603968-aaf79b4d-ec58-464b-ba64-847376fd6112.png)

**********************************************

Solution 2:

Now, we have to use PUT methord in POSTMAN, and display the result in MONGODB:

POSTMAN-
![image](https://user-images.githubusercontent.com/63108640/228604424-c0e948d4-14db-4464-a654-8cd5886f6188.png)
MONGODB-
![image](https://user-images.githubusercontent.com/63108640/228604747-f1ae64fa-2fab-4a26-88db-2c106ec4d724.png)

**********************************************

Solution 3:

Now, we have to Delete the record:

POSTMAN-
![image](https://user-images.githubusercontent.com/63108640/228605293-a4771b3e-90de-4763-8429-9ee2cad8e62f.png)
MONGODB-
![image](https://user-images.githubusercontent.com/63108640/228605397-52551d5a-2202-4429-b412-12a4d48aec6e.png)

**********************************************

Solution 4:

At last we have to GET the record by using name parameter:
![image](https://user-images.githubusercontent.com/63108640/228605706-5c0c62cd-88ff-42d2-8019-0a795653e61e.png)

*******************************************

*TASK 4. WEB UI Forms.*

Create a basic WEB UI frontend for an application that you created for #1 or #2 using any UI framework of your choice. You should be able to create, show and delete records from your UI.

*********************************************

First of all we have to create a HTML file using BOOTSTRAP. After running the code will get a LocalHost URL: https//:localhost/8020/.

At 1st we'll ADD Employees Details:
![image](https://user-images.githubusercontent.com/63108640/228610735-6ee404b2-f19e-451b-b156-eeaff49343e5.png)

We can also view the same in the webpage as shown below:
![image](https://user-images.githubusercontent.com/63108640/228610945-96cb319b-71f7-405d-b017-357635f69331.png)

Now we can view same in MONGODB:
![image](https://user-images.githubusercontent.com/63108640/228611076-be62c74b-2b5f-4368-9579-814dc391785c.png)

Now, we'll be deleting the employee record, just by clicking the "Delete" button in the table itself:
![image](https://user-images.githubusercontent.com/63108640/228611574-19a82e72-eb97-4f93-9bd6-9d3f5357220d.png)

We can also view the same in MONGODB:
![image](https://user-images.githubusercontent.com/63108640/228611675-84010b48-4b59-48ac-bcdc-990832be9de9.png)

**************************************************************

*THIS IS THE FINAL DOCUMENTATION OF THE KAIBURR ENGINEER PLACEMENT ASSESSMENT*
