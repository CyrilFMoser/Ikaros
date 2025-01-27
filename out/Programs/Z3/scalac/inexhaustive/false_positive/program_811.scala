package Program_31 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, (Int,Int)], b: T_B[T_A, T_A], c: T_B[T_A, T_A]) extends T_A
case class CC_B[C, D, E]() extends T_B[C, D]

val v_a: T_B[T_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B T_A Byte T_A (T_B T_A Byte))
// This is not matched: (CC_B T_A)