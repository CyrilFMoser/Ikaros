package Program_30 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B], b: T_A) extends T_A
case class CC_B[C](a: (T_A,T_A), b: C) extends T_A
case class CC_C[D]() extends T_B[D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_, _),CC_B(_, _)), _) => 0 
  case CC_B(_, _) => 1 
  case CC_B((CC_B(_, _),CC_A(_, _)), _) => 2 
  case CC_A(CC_C(), CC_A(_, _)) => 3 
  case CC_A(_, _) => 4 
  case CC_A(_, CC_A(_, _)) => 5 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Wildcard T_A)