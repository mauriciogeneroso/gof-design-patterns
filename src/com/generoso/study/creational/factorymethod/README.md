# Creational: Factory method
### Intent

Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory method lets a class defer instantiation to subclasses.

---
### When to use

* To enforce coding for interface rather than implementation.
* To transfer the responsability of instantiation from the client class to the factory method.
* to decouple the implementation from the client program.

---
### Components

1. An interface or abstract class to have a behavior contract
2. Set of implementation subclasses (private inside the package to not be accessible outside the package)
3. A public factory method to return the correct implementation to clients.

---
### Benefits

* Loose coupling allows changin the internals without impacting customer code
* factory method provides a single point of control for multiple products
* Number of instances and their reusability can be controlled with singleton or Multiton

---
### Drawbacks

* An extra level of abstraction makes the code more difficult to read

---
### Real world Examples

* Renting Vehicles. Customer needs to specify only the type of vehicle (car, truck, etc) that is needed. Customer need not know about the internal details of the vehicle.

---
### Software Examples

* Memcache
* Filecache
* code for SQL standard without worrying about the underlying DB

--- 
### Java SDK Examples

* java.util.Calendar.getInstance();
* java.util.ResourceBundle.getBundle();
* java.text.NumberFormat.getInstance();
* java.nio.charset.Charset.forName();
* java.util.EnumSet.of();
* javax.xml.bind.JAXBContext.createMarshaller();
