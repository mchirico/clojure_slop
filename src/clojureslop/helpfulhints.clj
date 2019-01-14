(ns clojureslop.helpfulhints)

(defprotocol MyProtocol
  (-f0 [this args]))

(defn f0 [this & args]
  (-f0 this args))

(defn -f0 [this & args]
  (filter this (flatten args)))

(defn d [x y]
  (def z {:a x :b y :c (+ x y)})
  (def m {:a x :b y :c (+ x y) :d (* x y)})
  (+ (+ x y) (* x y)))

(f0 odd? 1 2 3 4)
;=> (1 3)
;
;
