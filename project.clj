(defproject clojure_slop "0.0.1-SNAPSHOT"
  :description "Cool new project to do things and stuff"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.439"]
                 [figwheel-sidecar "0.5.15"]
                 [org.clojure/test.check "0.10.0-alpha3"]
                 [quil "2.7.1"]
                 [org.clojure/math.combinatorics "0.1.4"]
                 [org.clojure/tools.reader "1.3.2"]]
  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-figwheel "0.5.15"]]
  :profiles {:dev {:dependencies [[midje "1.9.5"]]}
             ;; You can add dependencies that apply to `lein midje` below.
             ;; An example would be changing the logging destination for test runs.
             :midje {}})
             ;; Note that Midje itself is in the `dev` profile to support
             ;; running autotest in the repl.

  
