(ns app.core
  (:require [next.jdbc :as jdbc])
  (:gen-class))

(def db {:jdbcUrl "jdbc:postgresql://localhost:5432/postgres?user=postgres&password=postgres"})
(def ds (jdbc/get-datasource db))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (prn (jdbc/execute! ds ["CREATE DATABASE tester"])))
