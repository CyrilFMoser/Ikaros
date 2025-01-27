package Program_30 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A]) extends T_A
case class CC_C[B](a: B, b: CC_B, c: Boolean) extends T_A
case class CC_D[C]() extends T_B[C]
case class CC_E[D]() extends T_B[D]
case class CC_F[E]() extends T_B[E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_F()) => 1 
  case CC_B(_, CC_D()) => 2 
  case CC_B(CC_A(), CC_D()) => 3 
  case CC_B(_, _) => 4 
  case CC_B(_, CC_E()) => 5 
  case CC_C(_, _, _) => 6 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants