# REPLR

[![Clojars Project](https://img.shields.io/clojars/v/replr.svg)](https://clojars.org/replr)

*Read* Eval Print Loop **and Read**!! UI to help you read your codebase!

![](resources/replr_wg.png)
*Initial layout of REPLR.*

- First pane will list all the namespaces available on your load-class.
- Second pane will list all the symbols available on your load-class.
- Third pane will show you the dependencies found for the selected symbols in **second** pane.
- Fourth pane will show you the references found for the selected symbols in the **third** pane.

## Instalation

``` clojure
[replr "0.1.5"]
```

There is already a nrepl middleware implemented that need to be used
if you desired to have instant feedback when a new function is created
or changed inside the project.

Add the following lines to your `project.clj`.

``` clojure
:repl-options {:nrepl-middleware [replr.middleware.nrepl/wrap-replr]}
```

In order to use it, after your REPL is open:
```clojure
(require '[replr.ui :as ui])

(ui/open)
```


## Caveats

- It only works with Java JDK 11
- You cannot use it from inside a Docker container.

The two main caveats will be addresses in future.

## Motivation

I read an interesting essay entitled [Design Patterns, Smalltalk, and the Lost Art of Reading Code](https://medium.com/@kylegenebrown/design-patterns-smalltalk-and-the-lost-art-of-reading-code-1727d93fd7fa) and I liked the idea of _reading your source code_ as a main source of building block to keep moving forward with your application.

This project has no pretension to provide the same flexibility as is
described about the Smalltalk entire environment. However, I am often
caught by surprise about the amount of code I depend on because I
wanted to use that single nice function that helps me accomplish the
task of the day.

![](resources/smalltalk.png)

*Squeak Smalltak showing 4-pane browser and workspace. From essay.*

The idea is to provide some visibility about the entire load class
available for you to use in your clojure project.


#### TODO

The free area in the right side is waiting for more
functionalities. Up to now, I thought about the display of a
dependency graph for the selected functions.

## License

Copyright 2020 Wanderson Ferreira

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
