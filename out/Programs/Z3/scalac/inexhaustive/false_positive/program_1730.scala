package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D]() extends T_A[C]
case class CC_B() extends T_A[T_A[Byte]]
case class CC_C[E, F](a: E, b: E, c: T_A[E]) extends T_B[E]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A (T_A (T_A Byte)) Boolean (T_A (T_A (T_A Byte))))
// This is not matched: (CC_A Wildcard T_A)