package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Boolean,Int), Char], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C(a: CC_B, b: T_A) extends T_A
case class CC_D[C](a: C, b: CC_A, c: CC_C) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_B(CC_A(_), CC_B(_, _)) => 2 
  case CC_B(CC_A(_), CC_C(_, _)) => 3 
  case CC_C(_, CC_A(_)) => 4 
  case CC_C(_, CC_B(_, _)) => 5 
  case CC_C(_, CC_C(_, _)) => 6 
}
}