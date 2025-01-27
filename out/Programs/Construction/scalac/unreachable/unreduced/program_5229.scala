package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: Char) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: T_B[CC_B, T_B[Int, Int]]) extends T_A
case class CC_D[C](a: T_B[C, T_A], b: T_A, c: CC_C) extends T_B[C, T_A]
case class CC_E[D]() extends T_B[D, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(CC_A(12, _)) => 2 
  case CC_B(CC_A(_, _)) => 3 
  case CC_C(_) => 4 
}
}