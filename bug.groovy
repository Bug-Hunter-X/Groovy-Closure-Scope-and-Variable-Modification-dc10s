```groovy
def myMethod(Closure c) {
  println "Before closure execution"
  c()
  println "After closure execution"
}

myMethod { println "Inside closure" }

myMethod { 
  def x = 10
  println x
  x = 20
}

myMethod { 
  def list = [1,2,3]
  list.each { println it}
  list.add(4)
} 
```