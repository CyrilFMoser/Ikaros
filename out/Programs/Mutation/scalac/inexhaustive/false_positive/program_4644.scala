package Program_31 

package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char) extends T_A[T_B[Boolean]]
case class CC_B[C](a: C, b: CC_A) extends T_A[T_B[Boolean]]
case class CC_C[D](a: T_B[CC_A], b: CC_B[D], c: Byte) extends T_B[D]
case class CC_D(a: T_A[CC_A]) extends T_B[CC_A]
case class CC_E(a: CC_D, b: CC_C[CC_D]) extends T_B[CC_A]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A (T_B Boolean)))
// This is not matched: Pattern match is empty without constants