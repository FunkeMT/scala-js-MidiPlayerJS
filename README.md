# Scala.js façade for MidiPlayerJS

[![Scala.js](https://www.scala-js.org/assets/badges/scalajs-0.6.8.svg)](https://www.scala-js.org)

[MidiPlayerJS](https://github.com/grimmdude/MidiPlayerJS) is a JavaScript library which handels MIDI files and converts MIDI events into JSON.

See also [MidiPlayerJS Docs](http://grimmdude.com/MidiPlayerJS/docs/) for additional information.
    
## Inclusions
    
The following supporting scala.js façades are included, **Player**.    
   
   
## References

1)  [MidiPlayerJS](https://github.com/grimmdude/MidiPlayerJS)

2)  [WebvrScala](https://github.com/workingDog/WebvrScala) [deployment ref]
   

## Dependencies
      
Using Scala.js-0.6.10, Scala-2.11.8, sbt-0.13.11


## Usage   
   
To publish this library locally, type:
   
     sbt publishLocally
   
This will put ` "com.github.funkemt" %%% "scala-js-midiplayerjs" % "0.1-SNAPSHOT" ` into your local repository.

Then in your [Scala.js](https://www.scala-js.org/) app build.sbt file, simply include:
    
     libraryDependencies += "com.github.funkemt" %%% "scala-js-midiplayerjs" % "0.1-SNAPSHOT"
     
Don't forget to add the JavaScript library itself.
MidiPlayerJS is available at [WebJars](https://www.webjars.org)

     libraryDependencies += "org.webjars.npm" % "midi-player-js" % "2.0.3",


## Status

Experimental
