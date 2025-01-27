package Program_15 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: C) extends T_A
case class CC_B[D]() extends T_A
case class CC_C[E](a: CC_A[E], b: Int, c: T_A) extends T_B[(T_A,Boolean), E]
case class CC_D[F]() extends T_B[CC_C[(Byte,Byte)], F]
case class CC_E[G](a: T_A, b: T_A, c: G) extends T_B[(T_A,Boolean), G]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), 12) => 0 
  case CC_A(CC_B(), 12) => 1 
  case CC_A(CC_A(_, _), _) => 2 
  case CC_A(CC_B(), _) => 3 
}
}
// This is not matched: (CC_A Int (CC_B T_A T_A) Wildcard T_A)
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)