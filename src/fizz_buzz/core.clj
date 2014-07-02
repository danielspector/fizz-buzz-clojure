(ns fizz-buzz.core)

(defn run-fb []
  (doseq [i (range 1 101)]
    (cond
     (zero? (rem i 15)) (println "FizzBuzz")
      (zero? (rem i 3)) (println "Fizz")
       (zero? (rem i 5)) (println "Buzz")
         :else (println i))))

(defn -main []
  (run-fb))
