
(ns demo.core
  (:require [reagent.core :as r]))

(defn child-component [] [:div "some child"])

(defn demo-component [] [:div "this is a demo of" [child-component]])

(defn mountit []
  (r/render-component
    [demo-component]
    (.querySelector js/document "#app")))

(mountit)