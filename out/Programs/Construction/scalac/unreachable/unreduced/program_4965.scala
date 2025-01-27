package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C]) extends T_A
case class CC_B(a: Boolean, b: T_A) extends T_A
case class CC_C(a: CC_A[CC_A[Char]], b: T_A) extends T_A
case class CC_D(a: CC_C) extends T_B[((CC_B,T_A),T_A), (CC_C,CC_A[(Char,Int)])]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(_), CC_A(_)) => 1 
  case CC_C(CC_A(_), CC_B(_, CC_A(_))) => 2 
  case CC_C(CC_A(_), CC_B(_, CC_B(_, _))) => 3 
  case CC_C(CC_A(_), CC_B(_, CC_C(_, _))) => 4 
  case CC_C(CC_A(_), CC_C(CC_A(_), _)) => 5 
}
}
// This is not matched: CC_A(_)