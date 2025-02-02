```groovy
def myMethod(Closure c) {
  println "Before closure execution"
  c.call()
  println "After closure execution"
}

myMethod { println "Inside closure" }

myMethod { 
  def x = 10
  println x
  x = 20
  println "x inside: ${x}"
}

myMethod { 
  def list = [1,2,3]
  def newList = list.clone() // Create a copy to avoid modifying original list
  newList.each { println it}
  newList.add(4)
  println "original list: ${list}"
  println "new list: ${newList}"
} 
```