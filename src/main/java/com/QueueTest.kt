package com

class ArrayQueue(private val maxSize: Int) {
    private var front: Int = -1
    private var rear: Int = -1
    private var arr = IntArray(maxSize)

    fun isFull(): Boolean {
        return rear == maxSize - 1
    }

    fun isEmpty(): Boolean {
        return rear == front
    }

    fun addQueue(item: Int) {
        if (isFull()) {
            println("队列已满")
            return
        }
        rear++
        arr[rear] = item
    }

    fun getQueue(): Int {
        if (isEmpty()) {
            throw RuntimeException("队列已空")
        }
        front++
        return arr[front]
    }

    fun showQueue() {
        if (isEmpty()) {
            println("队列为空")
        }
        arr.forEach { println(it) }
    }

    fun headQueue(): Int {
        if (isEmpty()) {
            throw RuntimeException("队列为空")
        }
        return arr[front + 1]
    }
}

fun main() {
    val arrayQueue=ArrayQueue(3)
    arrayQueue.addQueue(2)
    arrayQueue.addQueue(88)
    arrayQueue.addQueue(42)
    println(arrayQueue.getQueue())
}