Goal - ensure that a class has only one instance, while providing a global access point to this instance.
Problem - In your web application you are connecting to database using JDBC and this method being called multiple times for every request and this is causing DB max connection.


Solution - 

It should have a private constructor so that no instance of it can be created by other classes.
It should have a public static method so that the it can be called (SingletonClass.getInstance()) to get its singleton instance.All following calls to this method return the cached object.

Existing Implementation in JDK - 

LogManager.getLogger()

Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings etc.


Benefits - Saves memory because object is not created at each request. Only single instance is reused again and again.