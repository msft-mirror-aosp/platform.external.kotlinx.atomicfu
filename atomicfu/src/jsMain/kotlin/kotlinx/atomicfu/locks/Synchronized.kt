package kotlinx.atomicfu.locks

import kotlinx.atomicfu.REENTRANT_LOCK

public actual typealias SynchronizedObject = Any

@JsName(REENTRANT_LOCK)
public val Lock = ReentrantLock()

@Suppress("NOTHING_TO_INLINE")
public actual inline fun reentrantLock() = Lock

@Suppress("NOTHING_TO_INLINE")
public actual class ReentrantLock {
    actual inline fun lock(): Unit {}
    actual inline fun tryLock() = true
    actual inline fun unlock(): Unit {}
}

public actual inline fun <T> ReentrantLock.withLock(block: () -> T) = block()

public actual inline fun <T> synchronized(lock: SynchronizedObject, block: () -> T): T = block()