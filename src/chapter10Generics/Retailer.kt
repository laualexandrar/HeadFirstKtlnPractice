package chapter10Generics

interface Retailer<out T> {
fun sell (): T
}