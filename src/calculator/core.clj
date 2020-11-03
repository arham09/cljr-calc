(ns calculator.core
  (:require [calculator.calculator :as calculator])
  (:gen-class))


(defn -main
  "Main calculator func"
  [& args]
  (println "1. sum \n2. division \n3. multiplication \n4. subtraction")
  (println "Enter number fo your choice")
  (let [choice (read-line)]
    (calculator/calculate choice)))
