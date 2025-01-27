package Program_30 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[B](a: CC_A) extends T_B[B]
case class CC_D[C](a: T_B[Int], b: C, c: CC_A) extends T_B[C]
case class CC_E[D, E]() extends T_B[D]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_E() => 0 
  case CC_C(CC_A(_, _, _)) => 1 
  case CC_D(CC_E(), _, _) => 2 
  case CC_D(CC_C(_), _, CC_A(_, _, _)) => 3 
  case CC_D(CC_C(_), _, _) => 4 
  case CC_D(CC_D(_, _, _), _, CC_A(_, _, _)) => 5 
  case CC_D(CC_D(_, _, _), _, _) => 6 
  case CC_D(CC_E(), _, CC_A(_, _, _)) => 7 
}
}
// This is not matched: (CC_E Boolean T_A (T_B Boolean))
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)