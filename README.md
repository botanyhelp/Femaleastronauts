### Female Astronauts Android App README

Code for Female Astronauts android application.

This application builds a data structure at the time it launches on the phone.  This code snippet shows the data structures being constructed:

```{java}
public class Astronaut extends Activity {
        HashMap<String,Integer> photoMap = new HashMap<String,Integer>();
        HashMap<String,Integer> astronautMap = new HashMap<String,Integer>();
        @Override
            public void onCreate(Bundle savedInstanceState) {
            astronautMap.put("Valentina_Tereshkova", R.string.Valentina_Tereshkova);
            astronautMap.put("Svetlana_Savitskaya", R.string.Svetlana_Savitskaya);
            astronautMap.put("Sally_Ride", R.string.Sally_Ride);
            photoMap.put("Valentina_Tereshkova", R.drawable.valentina_tereshkova_big);
            photoMap.put("Svetlana_Savitskaya", R.drawable.svetlana_savitskaya_big);
            photoMap.put("Sally_Ride", R.drawable.sally_ride_big);
```
These lines give the code ready access to the images and text associated with every astronaut.  When the user selects an astronaut, the image and text are already available to be written to the screen.  

The other unusual thing is the images in the select list, alongside the name of the astronaut.  These images are great and deserve to be there.  The code to get it there is clunky.  

Almost all of the data, text and images in this app are kindly written and created by and shared by wikipedia authors under the license shown here:
[https://en.wikipedia.org/wiki/Wikipedia:Text_of_Creative_Commons_Attribution-ShareAlike_3.0_Unported_License](https://en.wikipedia.org/wiki/Wikipedia:Text_of_Creative_Commons_Attribution-ShareAlike_3.0_Unported_License)
