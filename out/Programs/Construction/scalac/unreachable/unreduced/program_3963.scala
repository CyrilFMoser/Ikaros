package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Int]) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: Char, b: T_B[CC_B, T_B[CC_A, T_A]], c: (T_B[CC_A, T_A],Char)) extends T_B[CC_A, T_A]
case class CC_D(a: Boolean, b: T_A) extends T_B[CC_A, T_A]
case class CC_E(a: Char) extends T_B[CC_A, T_A]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, CC_A(_)) => 1 
  case CC_D(_, CC_B(CC_A(_))) => 2 
  case CC_E('x') => 3 
  case CC_E(_) => 4 
}
}