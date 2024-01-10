This project consists of Java classes for implementing a basic credential database with a console-based user interface. The core functionality is provided by the CredentialDatabase class, which uses an instance of a custom hash table (ArrayHashTable) to store usernames and hashed passwords. The hashing algorithm used is MD5 for added security.

Two collision handling strategies are implemented as separate classes: LinearCollisionHandler and QuadraticCollisionHandler. These classes define methods for probing and searching in case of collisions within the hash table.

The AppMain class serves as a console-based user interface to interact with the CredentialDatabase. Users can log in, create accounts, change passwords, delete accounts, and view all logins for debugging purposes.

Usage
Compile the Code:

Compile all Java files in the app and structures packages using a Java compiler.
Run the Application:

Run the AppMain class to start the console-based user interface.
Follow the prompts to perform login, account creation, password change, account deletion, or view all logins.
Choose Collision Handling Strategy:

Inside the CredentialDatabase constructor, select the desired collision handler (LinearCollisionHandler or QuadraticCollisionHandler) by uncommenting the corresponding line.
Classes
1. CredentialDatabase
Manages user credentials using a hash table.
Implements methods for user login, account creation, password change, account deletion, and debugging information retrieval.
2. LinearCollisionHandler
Implements linear probing for collision resolution in a hash table.
3. QuadraticCollisionHandler
Implements quadratic probing for collision resolution in a hash table.
4. AppMain
Console-based user interface for interacting with the CredentialDatabase.
Allows users to perform various operations related to account management.
Security
Passwords are stored securely as hashed values using the MD5 hashing algorithm.
Hash table collision handling strategies (LinearCollisionHandler and QuadraticCollisionHandler) provide different approaches to handle collisions.
