
(require '[hiccup.core :refer [html]])

(defn render [data]
  (html
    [:html
     [:head
      [:title "Demo"]
      [:link
       {:ref "stylesheet", :type "text/css", :href "css/style.css"}]]
     [:body [:div#app] [:script {:src "cljs/main.js"}]]]))