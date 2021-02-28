# Interface segregation

larger interfaces should be split into smaller ones. By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

Example: 

consider an interface that outlines our roles as a bear keeper:

```
public interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
}
```
A professional bear-keeper might do all the above methods. But,
petting the bear is dangerous and prohibited for zoo-guests. 

So, we need to split (seggregate interfaces)