In heros_v2 we have the following requirements:

We have 3 superheros - Superman, Wonderwoman, and Aquaman 
All 3 use superpowers, AND they do it (aka implement) differently

**1. All hero's rest, AND they do it the same.**
**2. We'd like to call the superheros by their name e.g. "Wonder Woman"**
    - Please do this in rest functionality
    - Also, refactor useSuperPower to include their name


Q. We lead with an interface vs an abstract class because?
A. We can only extend one class, even if it's abstract but we can implement many interfaces.
(Leave your option to extend open!)

**Q. What if they all do it, AND, they all do it the same? Where does common behavior, i.e. rest, go? **  
    **- Remember, objects are about responsibility.**
    **- We don't want redundancy, that's bad.**
**A. IF they all do it, AND they all do it the same.  Use a common method in the supertype.**

