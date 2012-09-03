# jruby-test

A challenge:
http://twitter.com/cemerick/status/241259406220730368

Testing getting [jRuby]() working and compiling [SASS](http://sass-lang.com/development.html) ([github page](https://github.com/nex3/sass)) (so I can use Foundation) in Clojure.  Works!  Now onto getting it working with [Dieter](https://github.com/edgecase/dieter).

Installing Gems so this will work (the example from the Stackoverflow answer below):

```bash
$ mkdir gems
$ GEM_HOME=gems GEM_PATH=gems java -jar ~/.m2/repository/org/jruby/jruby-complete/1.6.7.2/jruby-complete-1.6.7.2.jar -S gem install hello-world
$ GEM_HOME=gems GEM_PATH=gems java -jar ~/.m2/repository/org/jruby/jruby-complete/1.6.7.2/jruby-complete-1.6.7.2.jar -S gem install sass
```

These links helped a lot:

* http://stackoverflow.com/questions/12073844/using-jruby-class-supplied-in-a-gem-from-clojure
* http://yokolet.blogspot.jp/2011/09/haml-on-clojure-web-app.html
* https://gist.github.com/1205198
* http://clojuredocs.org/clojure_core/clojure.core/import

And for getting SASS working programatically in the Ruby code:

* http://sass-lang.com/docs/yardoc/index.html

## License

Copyright © 2012 Dave Della Costa

Distributed under the MIT License (http://dd.mit-license.org/)
