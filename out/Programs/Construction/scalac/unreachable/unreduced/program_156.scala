package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Char, Char]) extends T_A
case class CC_B(a: T_A, b: Byte) extends T_A
case class CC_C() extends T_A
case class CC_D(a: (T_B[Boolean, T_A],(Byte,Boolean)), b: Int, c: Int) extends T_B[CC_C, T_B[T_A, CC_A]]
case class CC_E() extends T_B[T_A, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}