# FoodTruckProject

## Description

### Technologies Used
Java, OOP, Eclipse

### Lessons Learned

In this project, I mainly struggled with sending in parameters when creating a new object.

```
{
FoodTruck truck = new FoodTruck(truckName, foodType, scale);
}
```
When creating the `FoodTruck` at first I was not using the parameters and instead trying to set them individually using a different instance. This was keeping me from adding different trucks to the array.

Later in the program in `public void menu()`, I was creating a new instance of `FoodTruck` to call different methods in `FoodTruckApp` instead of just using the `menu()`. This was causing my code to use the new instance which had no references to any of the trucks. Figuring out this problem helped further my understanding of what it means to create new objects.

In the `calculateAvg()` method, I was having trouble using a `for loop` if there were trucks not entered, thus leaving `null`s and throwing off my compiler. I fixed this by using an `if` statement checking if the index was != null. Once I had this problem corrected, everything else followed.

### How to use this program

The program will ask you to enter the information of a food truck of your choice, including the name, what type of food, and your rating of that truck. After entering your trucks (up to 5) you will then be asked if you want the list back, an average of the ratings between all trucks, only the highest truck, or to exit the program.

Try it out!

- Parris