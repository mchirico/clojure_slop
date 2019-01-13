# clojure_slop

The project uses [Midje](https://github.com/marick/Midje/).

## How to run the tests

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.
# clojure_slop


## Setup

Still having problems understanding *project.clij* setup, as it doesn't
default to what I want with `lein midje new <project>` 

`cat project.clj`
```bash
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
```

## Additional Documentation

[Confluence Docs](https://confluence.aipiggybot.io/display/CLOJ/Clojure+Documentation)