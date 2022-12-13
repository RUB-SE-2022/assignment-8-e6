# What was hard
We've encountered various difficulties while developing
this 'Framework.'

## SWT
First of all, SWT gave us a hard time.
This is largely due to us using IntelliJ with a Framework 
primarily designed for use in Eclipse IDEs. This was one of the 
Reasons why we weren't able to get SWT Working on Windows or MacOS.
After countless tries and a ton of outdated Information we decided
to abandon both Windows and MacOS in favor of Linux, where SWT just 
installed like a Regular Gradle Dependency.

But the trouble with SWT didn't stop there! After being able to
finally compile our project we realized the Documentation was lacking 
a lot of important Information.
This is because the "API Reference" on their Page is little more than 
stock JavaDocs. Beside that the only pieces of Information provided where 
inside the Eclipse User-Manual which means, that we've had to 
translate Eclipses Features into IntelliJs which took a while.
Besides that the only useful Information we got from the official User Manual
 / Documentation was on how to render the UI. We've gathered
the remaining pieces of information through a combination of Stack overflow Q & As
and YouTube tutorials.