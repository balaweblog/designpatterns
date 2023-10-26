Goal - construct complex objects step by step
Problem - Assuming you are working on creating a loan application and want to create a loan object with multiple user input data like applicant name, address name around 100+ fields you cant create constructor and feed in and it will be lot of parameter and nasty code

Solution - The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders.

Existing Implementation in JDK - 

                    StringBuilder builder = new StringBuilder("Temp");

                    String data = builder.append(1)
                            .append(true)
                            .append("friend")
                            .toString();

Benefits - Design Flexiblity and Better Code readablity 
