package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,(T_A,T_A)), b: T_A) extends T_A
case class CC_B(a: CC_A, b: T_B[CC_A, T_B[CC_A, CC_A]]) extends T_A
case class CC_C[C](a: CC_A, b: CC_B, c: C) extends T_B[C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_B(CC_A((_,_), _), _) => 2 
}
}