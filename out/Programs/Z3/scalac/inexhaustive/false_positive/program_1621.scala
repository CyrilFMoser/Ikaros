package Program_30 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Boolean], b: T_A[Char]) extends T_A[(Boolean,Char)]
case class CC_B[C](a: CC_A, b: T_A[C], c: C) extends T_A[(Boolean,Char)]
case class CC_C[D]() extends T_B[D]
case class CC_D() extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]

val v_a: T_A[(Boolean,Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), CC_B(_, _, _), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_A(_, _), _, _) => 3 
  case CC_B(_, CC_A(_, _), _) => 4 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 5 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard Boolean (T_A (Tuple Boolean Char)))
// This is not matched: (CC_C (CC_A Wildcard T_A) T_B)