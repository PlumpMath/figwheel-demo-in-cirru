
require $ quote $ [] hiccup.core :refer $ [] html

defn render (data)
  html
    [] :html
      [] :head
        [] :title "|Demo"
        [] :link
          {} (:type |text/css) (:href |css/style.css) (:ref |stylesheet)
      [] :body
        [] :div#app
        [] :script
          {} (:src "|cljs/main.js")
