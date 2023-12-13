Goal - Adapter is a structural design pattern that allows objects with incompatible interfaces to colloborate. Eg: CommerceHub adapters different format for different purposes xml, json etc. for different payment hubs

Problem - Stock app shows nice charts render xml data from your db. if you want to integrate data from zerodha which will give json only. your chart will support only xml. you cant ask zerodha to send xml or rather it is not open source to do it

Solution -
You can create an adapter. this is special object that convers the interface of one object so that another object can understand it 
json to XML adapter; ZERODHA API -> Json -> Adapter -> XML -> Stock market UI 

Existing Implementation in JDK

java.io.InputStreamReader(InputStream) - It reads bytes and decodes them into characters using a specified charset
java.io.OutputStreamWriter(OutputStream) - characters written to it are encoded into bytes using a specified charset

Benefits - 
1. It allows one or more previsouly incompatible objects to interact
2. It allows reusablity of existing functionality and flexiblity 


https://www.youtube.com/watch?v=eR22JuwTa54