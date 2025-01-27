package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Char, c: T_B[T_A]) extends T_A
case class CC_B(a: Char, b: T_B[T_A]) extends T_B[CC_A]
case class CC_C(a: Int, b: Int) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}