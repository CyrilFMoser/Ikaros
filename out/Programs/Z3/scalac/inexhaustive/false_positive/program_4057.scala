package Program_10 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[B](a: B) extends T_A
case class CC_D[C]() extends T_B[C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
  case CC_A(CC_A(_, _), CC_D()) => 1 
}
}
// This is not matched: (CC_A (CC_C Boolean Boolean T_A) Wildcard T_A)
// This is not matched: (CC_B (CC_A T_A (CC_B Wildcard Wildcard T_A) Char T_A) Wildcard T_A)