# Groovy Closure Scope and Variable Modification

This example demonstrates a common issue in Groovy related to the scope of variables within closures and how modifications inside a closure impact the variable's value outside the closure.  Understanding this behavior is crucial to prevent unexpected results in your Groovy code. 

## The Problem

The `bug.groovy` file contains a series of closure examples. Notice how modifying variables *within* the closure sometimes affects the variable outside, and sometimes it doesn't.  This inconsistency is the source of many subtle bugs.

## The Solution

The `bugSolution.groovy` file illustrates how to resolve the unexpected behavior by properly understanding closure scope and using techniques like explicit variable declarations or creating copies if necessary.