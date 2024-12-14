In heros_v3 we have the following requirements:

We have 3 superheros - Superman, Wonderwoman, and Aquaman 
All 3 use superpowers, AND they do it (aka implement) differently

All hero's rest, AND they do it the same. 
We'd like to call the superheros by their name e.g. "Wonder Woman"
    - Please do this in rest
    - Also, refactor useSuperPower to include their name

Superman and WonderWoman fly, but Aquaman does not.

**1. We have a request to implement new functionality - train.**
    **- What questions do you have for me?**
        **- Yes, they all do it.**
        **- Yes, they all do it the same.**
    **- But the villains in our game also train, and they do it the SAME way**

Q. We lead with an interface vs an abstract class because?
A. We can only extend one class, even if it's abstract but we can implement many interfaces.
(Leave your option to extend open!)

Q. What if they all do it, AND, they all do it the same? Where does common behavior, i.e. rest, go?  
    - Remember, objects are about responsibility.
    - We don't want redundancy, that's bad.
A. IF they all do it, AND they all do it the same.  Use a common method in the supertype.

Q. What if only some of them do it?
  - Maybe just have an null or nonsensical method?
A. Put a specific interface over the classes that need to implement the new responsibility.

**Q. What if they all do it the same, BUT, something unrelated also does it the same?**
    **-Hmm...interface?  Abstract class?**
**A. Put the behavior in a common class and use it (think composition) vs inherit it.**
    **- You're already an expert.  Think about String, can you subclass String?** 



