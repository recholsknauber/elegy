(ns elegy.core
  (:gen-class))

;; The type returned by this is "clojure.lang.Repeat"?
(defn string-repeat
  "Repeats a given string a specified number of times."
  [chosen-string reps]
  (repeat reps chosen-string))

;; Print a collection, each item on a new line.
(defn print-coll
  "Prints a given collection item-by-item on new lines."
  [coll]
  (for [x coll]
    (print x "\n"))
  )

;; A really cool string.
(def loogout "Listen up World, here it comes. Loogout ya bish.")

;; Print the really cool string many times.
(print-coll (string-repeat loogout 10))

;; A test of a for loop on concatenated string vectors.
(for [x (concat ["Whales."] ["\n"])]
              (print x))

;; Handle an infinite number of arguments, in this case multiplying them all.
(defn do-this-to-everything
  "Do `this` (a func), to `everything` (any number of args)."
  [this & everything]
  (if (nil? everything)
    nil
    (loop [x (rest everything)
           y (first everything)
           a this]
      (if (empty? x)
        y
        (recur (rest x) (this y (first x)) this))
      )
    ))

(do-this-to-everything * 10 2 3 4 10 10)


(defn iterate-func-map [m func num]
  (loop [x (map func m)
         n num
         result []]
    (if (= (count result) n)
      result
      (recur (map func x) n (conj result x)))
    ))

(take 3 (iterate-func-map [1 2 3] #(*' 9 %) 5))
(take-last 2 (iterate-func-map [1 2 3] #(*' 9 %) 50))

(defn gimme-that-math [s n]
  (loop [st s
         nu n
         result []]
    (if (<= nu (count result))
      result
      (recur st nu (conj result st))
      )))

(defn iterate-exponential [nu func cnt]
  (loop [x nu
        y func
        n cnt
        result []]
   (if (<= n (count result))
     result
     (recur x y n
            (conj result (y x (y x (+ (count result) 1))))))))



;; (defn look
;;   ""
;;   [x]
;;   (do-this-to-everything + x))

;; (defn -main
;;   "I don't do a whole lot ... yet."
;;   [reps]
;;   (for [x ]
;;     (print x)))
