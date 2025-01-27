package Program_13 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B) extends T_A[B]
case class CC_B[C](a: C, b: C, c: C) extends T_A[T_A[Int]]
case class CC_C(a: Int) extends T_A[T_A[Int]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, 12) => 0 
  case CC_B(12, 12, _) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B T_A Wildcard T_A)