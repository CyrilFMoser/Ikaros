package Program_15 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int]) extends T_A[T_A[Char]]
case class CC_B[B](a: CC_A) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A (T_A Char)))
// This is not matched: (CC_B T_A)