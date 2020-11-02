(ns calculator.core
  (:gen-class))

(defn sum
  "sum 2 numbers"
  [a b]
  (+ a b))

(defn substract
  "substract 2 numbers"
  [a b]
  (- a b))

(defn multiply
  "multiply 2 numbers"
  [a b]
  (* a b))

(defn divide
  "divide 2 numbers"
  [a b]
  (double (/ a b)))

(defn parse-int
  "parse string to integer"
  [s]
  (Integer. (re-find  #"\d+" s )))

(defn -main
  "Main calculator func"
  [& args]
  (println "1. sum \n2. division \n3. multiplication \n4. subtraction")
  (println "Enter number fo your choice")
  (let [choice (read-line)]
    (println "Enter your number")
    (cond
      (= choice "sum") (let [a (read-line) b (read-line)] (println "Result is" (sum (parse-int a) (parse-int b))))
      (= choice "division") (let [a (read-line) b (read-line)] (println "Result is" (divide (parse-int a) (parse-int b))))
      (= choice "multiplication") (let [a (read-line) b (read-line)] (println "Result is" (multiply (parse-int a) (parse-int b))))
      (= choice "subtraction") (let [a (read-line) b (read-line)] (println "Result is" (substract (parse-int a) (parse-int b))))
      :else (println "Invalid choice"))))
