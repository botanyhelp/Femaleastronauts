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

ImageMagick convert created the application icons like this:
```{bash}
convert -resize 36x36 fa.png fa36/fa.png
convert -resize 48x48 fa.png fa48/fa.png
convert -resize 72x72 fa.png fa72/fa.png
convert -resize 96x96 fa.png fa96/fa.png
convert -resize 144x144 fa.png fa144/fa.png
convert -resize 192x192 fa.png fa192/fa.png
```
Creating the data found in **res/values/strings.xml** was made by parsing data out of files with this python which reads some files and tries to dump something nearly suitable for strings.xml:
```{python}
from __future__ import print_function
f=open("zALL.text89", 'rb')
f2=open("femaleAstronauts_Names.txt", 'rb')
flist=[]
f2list=[]
for line in f.readlines():
    flist.append(line.rstrip())
for line in f2.readlines():
    f2list.append(line.rstrip())
for i in range(57):
    print(f2list[i],end='')
    print(flist[i])
```
The [documentation about strings.xml](http://developer.android.com/guide/topics/resources/string-resource.html) shows the destination formatting of your data.  We start with the data in **femaleAstronauts_Names.txt** which looks like this:
```{xml}
<string name="Valentina_Tereshkova">
<string name="Svetlana_Savitskaya">
<string name="Sally_Ride">
```
Here we see the second line of the file read by the python above, **zALL.text89**:
```
Svetlana Yevgenyevna Savitskaya (Russian: Светла́на Евге́ньевна Сави́цкая; born August 8, 1948) is a former Soviet aviator and cosmonaut who flew aboard Soyuz T&#8211;7 in 1982, becoming the second woman in space some 19 years after Valentina Tereshkova.\n\nContents  [hide] \n1 Biography\n2 Honours and awards\n3 See also\n4 References\n5 External links\nBiography[edit]\nShe became the first woman to perform a space walk on July 25, 1984. She conducted an EVA outside the Salyut 7 space station for 3 hours 35 minutes during which she cut and welded metals in space along with her colleague Vladimir Dzhanibekov.[1][2] Of the 57 Soviet/Russian spacewalkers through 2010, she is the only female. She is the daughter of Soviet military commander Yevgeniy Savitskiy. She is married, with one child, a son born 1986[3].\n\nShe started training as a cosmonaut in 1980. Upon returning to Earth, Savitskaya was assigned as the commander of an all&#8211;female Soyuz crew to Salyut 7 in commemoration of the International Women\'s Day, a mission that was later canceled.\n\nShe was twice awarded the Hero of the Soviet Union title. The asteroid 4118 Sveta is named for her.[4]\n\nShe was also a test and sports pilot &#8211; starting from 1974 she set 18 international world records on MiG aircraft and three records in team parachute jumping. She won first place at the 6th FAI World Aerobatic Championship in 1970.\n\nSavitskaya retired in 1993 from the Russian Air Force with the rank of Major.\n\nShe is a member of the State Duma representing the Communist Party of the Russian Federation. She presently serves as Deputy Chair of the Committee on Defense, and is also a member of the Coordination council presidium of the National Patriotic Union.[5]\n\nHonours and awards[edit]\nThis article incorporates information from the equivalent article on the Russian Wikipedia.\nHero of the Soviet Union, twice (1982, 1984)\nOrders of Lenin, twice (1982, 1984)\nOrder of the Badge of Honour (1976)\nMedal \"For Merit in Space Exploration\" (12 April 2011) &#8211; for great achievements in the field of research, development and utilization of outer space, many years of honest work, public activities\nPilot&#8211;Cosmonaut of the USSR\nHonoured Master of Sports\nGold Medal and 18 degrees FAI\n16 gold medals, sports of the USSR\nSpecial medal for the women\'s world record stay in space\nSavitskaya was one of five cosmonauts selected to raise the Russian flag at the Sochi 2014 Winter Olympics opening ceremony.[6]\n\nSee also[edit]\nList of female astronauts\nReferences[edit]\n^ \"Biographies of USSR / Russian Cosmonauts\". Space Facts. 9 August 2012. Retrieved 18 February 2014.\n^ \"Space welding anniversary!\". Orbiter&#8211;Forum. Jelsoft Enterprises Ltd. 16 July 2009. Retrieved 18 February 2014.\n^ . Brighthub http://www.brighthub.com/science/space/articles/21373.aspx. Retrieved April 12 2014. Missing or empty |title= (help)\n^ Schmadel, Lutz D. (2003). Dictionary of Minor Planet Names, Volume 1. New York: Springer. p. 352. ISBN 3&#8211;540&#8211;00238&#8211;3.\n^ Role in Russian State Duma\n^ \"The XXII Olympic Winter Games in Sochi in 2014 has opened with a grand show\". www.Sochi2014.com. 08 February 2014. Retrieved 11 February 2014.\n
```
Alot of sed and other pre-formatting effort went into that line.  Hopefully when it gets to the android phone screen, its readable!

Almost all of the data, text and images in this app are kindly written and created by and shared by wikipedia authors under the license shown here:
[https://en.wikipedia.org/wiki/Wikipedia:Text_of_Creative_Commons_Attribution-ShareAlike_3.0_Unported_License](https://en.wikipedia.org/wiki/Wikipedia:Text_of_Creative_Commons_Attribution-ShareAlike_3.0_Unported_License)
