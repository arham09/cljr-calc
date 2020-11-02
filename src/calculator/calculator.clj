(ns calculator.calculator)

(defn sum
  "sum 2 numbers"
  [a b]
  (+ a b))

(defn substract
  "subtract 2 numbers"
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

(defn calculate
  "Calculate based on input"
  [choice]
  (println "Insert Two Numbers")
  (let [a (read-line) b (read-line)]
    (cond
      (= choice "sum") (println "Result is" (sum (parse-int a) (parse-int b)))
      (= choice "substraction") (println "Result is" (substract (parse-int a) (parse-int b)))
      (= choice "multiplication") (println "Result is" (multiply (parse-int a) (parse-int b)))
      (= choice "division") (println "Result is" (divide (parse-int a) (parse-int b))))))