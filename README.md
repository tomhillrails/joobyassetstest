# joobyassetstest
Test of running jooby assets module from idea as opposed to maven

Okay, so I see slightly weird behaviour when I try to run jooby by just running or debugging the main App.kt file from IDEA as opposed to
using mvn jooby:run when it comes to the assets module.

If I run using mvn jooby:run then any changes I make to the css file (test.css) are automatically reflected when I refresh the page.  This
makes sense since my understanding is that resources are not cached in development mode.

If however, I simply run the project by opening it in IDEA and using the run / debug options against App.kt, the page still shows that it
is running in dev mode, but changes to test.css don't get picked up until I stop and start the project again.

The reason for wanting to do it this way is that I was using DCEVM for the ability to hotswap classes as it was massively faster than
the mvn jooby:run hotswapping when it came to kotlin.
