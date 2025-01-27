package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_B[Int, Char]) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[T_B[T_A, CC_C], CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}