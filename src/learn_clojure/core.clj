(ns learn-clojure.core)

(defn logger [message] (println (str "System output is: " message)))

(defn businessLogic
  [number1, number2, number3]
  (+ number1 number2 number3 (* number1 number2)))

(defn -main
  "Main function documentation: 
   to see me run lein repl and (source -main)"
  []
  (logger (businessLogic 1 2 3)))
