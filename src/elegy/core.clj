(ns elegy.core
  (:gen-class))

;; The type returned by this is "clojure.lang.Repeat"?
(defn string-repeat [chosen-string reps]
  (repeat reps chosen-string))

;; Print a collection
(defn print-coll
  [coll]
  (for [x coll]
    (print x))
  )

(def loogout "Listen up World, here it comes. Loogout ya bish. \n")

(print-coll (string-repeat loogout 10))


(for [x (concat ["Whales."] ["\n"])]
              (print x))

(defn forever [a b c & d]
  (if (nil? d)
    (* a b c)
    (loop [x d
           y (* a b c)]
      (if (empty? x)
        y
        (recur (rest x) (* y (first x))))
      )
    ))

(forever 10 2 3 4 10 10)

(defn -main
  "I don't do a whole lot ... yet."
  [reps]
  (for [x ]
    (print x)))
