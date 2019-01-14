(ns clojureslop.core
  (:gen-class)
  (:require [org.httpkit.server :refer [run-server]]
            [clj-time.core :as t])

  )

(defn quad [a b c]
  (let [disc (-
              (* b b)
              (* 4 a c))]
    [(/
      (+ (- b) (Math/sqrt disc))
      (* 2 a))
     (/
      (- (- b) (Math/sqrt disc))
      (* 2 a))]))

(defn myFun [a b c]
  (+ (+ a b c) 3))

(defn myFunc2 [a b]
  (+ 3 4))

; TODO: instrucitons for compile
; lein uberjar
;
; **  Here's an example: **
;
; java -jar /Users/mchirico/clojure_slop/target/clojure_slop-0.0.1-SNAPSHOT-standalone.jar one two three
;          Welcome to my project! These are your args: (one two three)
;          (myFunc2 2 3) =>  7
;


(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str (t/time-now) "<br><br> (myFunc2 2 3) => "  (myFunc2 2 3))
   })

(defn -main [& args]
  (run-server app {:port 8080})
  (println "Server started on port 8080"))
