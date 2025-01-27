package Program_30 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, Char]) extends T_A[T_A[Char]]
case class CC_B(a: Char, b: CC_A, c: T_A[(Char,Int)]) extends T_A[T_A[Char]]
case class CC_C[D]() extends T_A[T_A[CC_B]]

val v_a: T_A[T_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C Boolean (T_A (T_A (CC_B Boolean Boolean Boolean Boolean))))
// This is not matched: (CC_A Wildcard T_A)