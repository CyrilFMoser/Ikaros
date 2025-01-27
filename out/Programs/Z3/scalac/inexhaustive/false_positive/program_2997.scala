package Program_14 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[T_A]) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C[B](a: CC_B) extends T_A
case class CC_D[C](a: C) extends T_B[C]
case class CC_E[D](a: T_A, b: CC_A) extends T_B[D]
case class CC_F[E]() extends T_B[E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _)) => 0 
  case CC_A(_, CC_D(_)) => 1 
  case CC_A(_, _) => 2 
  case CC_A(0, _) => 3 
  case CC_B(CC_B(_, _), _) => 4 
  case CC_B(CC_C(_), CC_A(_, _)) => 5 
  case CC_B(_, CC_A(_, _)) => 6 
}
}
// This is not matched: (CC_C T_A Wildcard T_A)
// This is not matched: (CC_A Wildcard Wildcard T_A)