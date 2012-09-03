(ns jruby-test.core
  (:import (org.jruby.javasupport JavaEmbedUtils)))

(defn -main
  "I don't do a whole lot."
  [& args]
  (let [runtime (JavaEmbedUtils/initialize (list))
        evaler  (JavaEmbedUtils/newRuntimeAdapter)]
    (doseq [ruby-expr ["require('rubygems')"
                       "require('gems/gems/hello-world-1.2.0/lib/hello-world')"]]
                       "p 'yes!'"]]
      (.eval evaler runtime ruby-expr))))

;;  (println "Hello, World!"))
