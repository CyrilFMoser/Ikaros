package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: Boolean, b: T_A) extends T_A
case class CC_C(a: CC_B, b: T_B[CC_B, CC_A], c: CC_B) extends T_A
case class CC_D[C](a: CC_C, b: Char, c: CC_B) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, CC_A(_))) => 1 
  case CC_A(CC_B(_, CC_B(_, _))) => 2 
  case CC_A(CC_B(_, CC_C(_, _, _))) => 3 
  case CC_A(CC_C(CC_B(_, _), _, CC_B(_, _))) => 4 
  case CC_B(_, CC_A(_)) => 5 
  case CC_B(_, CC_B(_, _)) => 6 
  case CC_B(_, CC_C(_, _, _)) => 7 
  case CC_C(CC_B(_, CC_A(_)), _, CC_B(_, _)) => 8 
  case CC_C(CC_B(_, CC_B(_, _)), _, CC_B(_, _)) => 9 
  case CC_C(CC_B(_, CC_C(_, _, _)), _, CC_B(_, _)) => 10 
}
}