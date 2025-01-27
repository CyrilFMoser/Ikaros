package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: Boolean) extends T_A
case class CC_B(a: T_B[T_B[CC_A]]) extends T_A
case class CC_C(a: T_B[T_A], b: T_A) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
}
}