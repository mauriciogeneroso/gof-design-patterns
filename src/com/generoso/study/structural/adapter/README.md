# Structural: Adapter
### Intent

Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

---
### When to use

* To wrap an existing class with a new interface.
* To perform impedance matching.

---
### Components

1. Target - defines the domain-specific interface that client uses.
2. Adapter - adapts the interface Adaptee to the Target interface.
3. Adaptee - defines an existing interface that needs adapting.
4. Client - collaborates with objects conforming to the Target interface.

---
### Example of implementation

Assume that you have an e-commerce application which is serving your customers for a long time. This e-commerce application is using a Legacy Order Management system (OMS). Due to the high maintenance cost and degraded pergormance of the legacy OMS software, you have decided to use a cheap and efficient OMS software which is readily available in the market. However, you realize that the interfaces are different in the new sofware and it requires a lot of code changein the existing e-commerce interface.

Adapter design pattern can be very useful in these situations. Instead of modifying your e-commerce application to use the new interfaces, you can write a 'wrapper' class that acts as a bridge between your e-commerce application and the new OMS software. With this approach, the e-commerce application can still use the old interface.

Adapter design pattern can be implemented in two ways. one using the inheritance method (Class Adapter) and second using the composition (Object Adapter). The following example depicts the implementation of Object Adapter.

---
### Structure

Before: <br />
<img src="./structural_adapter_before.jpg" width="600" height="400">

After: <br />
<img src="./structural_adapter_after.jpg" width="600" height="400">

---
### Benefits

* Class adapter can override adaptee's behavior.
* Objects adapter allows a single adapter to work with many adapters.
* Helps achieve reusability and flexibility.
* Client class is not complicated by having to use a different interface and can use polymorphism to swap between different implementations of adapters.

---
### Drawbacks

* Object adapter involves an extra level of indirection.

---
### Real world Examples

* Power adapters.
* Memory card adapters.

---
### Software Examples

* wrappers used to adopt 3rd parties libraries and frameworks.

--- 
### Java SDK Examples

* java.util.Arrays.asList();
* java.util.Collections.list();
* java.util.Collections.enumeration();
* java.io.InputStreamReader(InputStream) (returns a Reader);
* java.io.OutputStreamReader(OutputStream) (returns a Writer);
