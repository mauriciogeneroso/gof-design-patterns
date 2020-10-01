# Structural: Flyweight
### Intent

Use sharing to support large numbers of fine-grained objects efficiently.

---
### When to use

* To improve the performance when large number of objects to be created.

---
### Example

Assume that you want to create a car racing game where there will be one player, a few opponents, and a bunch of traffic vehicles. These traffic vehicles need to appear throughout the game and there can be hundreds of such vehicles appearing during the course of the race. All these traffic vehicles have a common mission (that is creating traffic of the road) but the type, color, size of the vehicles can vary. Creating each and every traffic vehicle will increase the load on the memory. Flyweight pattern can be applied here to improve the performance and reduce memory usage. It is achieved by segregating object properties into two types: intrinsic and extrinsic.

In a race, a traffic vehicle needs to appear only for a shorter time. So, it is not required to create all the traffic vehicles at once. Instead, a bunch of traffic vehicles can be created. These vehicles will have an intrinsic state like the task and vehicle id. Other properties like the vehicle type, color, size, etc. can be made extrinsic so that different types of vehicles can be created based on the input. When a traffic vehicle pool and the extrinsic properties are applied to change to change the appearance of the vehicle. When the traffic vehicle goes out of the scene, it can be returned to the pool so that it can be reused.

---
### Structure

<img src="./structural_flyweight.jpg" width="600" height="400">

---
### Benefits

* The total number of instances can be reduced.
* objects sharing reduces the total memory used.

---
### Drawbacks

* May introduce run-time costs associated with transferring, finding, and/or computing extrinsic state, specially if it was formerly stored as intrinsic state.

---
### Java SDK Examples

* java.lang.Integer.valueOf(int) (also on Boolean, Byte, Character, Short, long and BigDecimal).
