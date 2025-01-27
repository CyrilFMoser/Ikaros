package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_B[T_A, T_A]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: C, b: C, c: T_A) extends T_A
case class CC_D[D]() extends T_B[CC_C[CC_C[CC_A]], D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _, _), _, _), _) => 0 
  case CC_A(_, CC_A(CC_B(_), _, _), _) => 1 
  case CC_A(_, CC_A(CC_C(_, _, _), _, _), _) => 2 
  case CC_A(_, CC_B(_), _) => 3 
  case CC_A(_, CC_C(_, _, CC_A(_, _, _)), _) => 4 
  case CC_A(_, CC_C(_, _, CC_B(_)), _) => 5 
  case CC_A(_, CC_C(_, _, CC_C(_, _, _)), _) => 6 
  case CC_C(_, _, _) => 7 
}
}
// This is not matched: CC_B(_)