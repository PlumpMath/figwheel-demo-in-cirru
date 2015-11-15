(defproject demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]
                 [reagent "0.5.1"]
                 [hiccup "1.0.5"]]
  :plugins [[cirru/lein-sepal "0.0.10"]
            [mvc-works/lein-html-entry "0.0.2"]
            [lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.0-1"]]
  :cirru-sepal {:paths ["cirru-src" "cirru-src-clj"] :extension ".cljs"}
  :html-entry {:file "src-clj/html.clj" :output "resources/public/index.html"}

  :clean-targets ^{:protect false} [:target-path "resources/public/cljs"]
  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :figwheel true
                        :compiler {:main "demo.core"
                                   :asset-path "cljs/out"
                                   :output-to  "resources/public/cljs/main.js"
                                   :output-dir "resources/public/cljs/out"}}]}
  :figwheel {:css-dirs ["resources/public/css"]})
