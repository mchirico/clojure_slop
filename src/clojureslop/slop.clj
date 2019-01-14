(ns clojureslop.slop)

(defn d [x y]
  (def z {:a x :b y :c (+ x y)})
  (def m {:a x :b y :c (+ x y) :d (* x y)})
  (+ (+ x y) (* x y)))

