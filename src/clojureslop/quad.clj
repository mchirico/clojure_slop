(ns clojureslop.quad)


(defn myFun [a b c]
  (+ (+ a b c) 3)
  )


(defn myFunc2 [a b]
  (def z {:a a :b b :c (+ a b)})
  )