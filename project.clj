(defproject lightmod "1.3.1-SNAPSHOT"
  :description "An all-in-one tool for full stack Clojure"
  :url "https://github.com/oakes/Lightmod"
  :license {:name "Public Domain"
            :url "http://unlicense.org/UNLICENSE"}
  :repositories [["clojars" {:url "https://clojars.org/repo"
                             :sign-releases false}]]
  :aot [lightmod.start lightmod.core]
  :main lightmod.start)
