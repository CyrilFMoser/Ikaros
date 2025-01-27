package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: CC_A, c: T_B[Int, T_B[T_A, Boolean]]) extends T_A
case class CC_C[C](a: C, b: CC_B) extends T_A
case class CC_D(a: CC_C[CC_C[T_A]], b: CC_C[Int]) extends T_B[CC_A, T_B[CC_A, CC_B]]
case class CC_E() extends T_B[CC_A, T_B[CC_A, CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _)) => 0 
  case CC_A(CC_C(_, _)) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, CC_B(_, CC_A(_), _)) => 3 
}
}
// This is not matched: CC_A(CC_A(_))