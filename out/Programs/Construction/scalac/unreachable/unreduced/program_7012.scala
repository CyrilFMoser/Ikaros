package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: Char) extends T_A
case class CC_C(a: CC_A, b: T_B[T_B[CC_A, T_A], CC_B]) extends T_A
case class CC_D(a: T_B[T_A, Char]) extends T_B[CC_B, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(), _) => 2 
}
}