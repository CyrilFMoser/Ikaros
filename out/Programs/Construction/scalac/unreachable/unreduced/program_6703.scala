package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (Char,T_A), b: Char) extends T_A
case class CC_C(a: T_A, b: T_B[(CC_B,CC_A)]) extends T_A
case class CC_D(a: T_B[CC_A]) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}