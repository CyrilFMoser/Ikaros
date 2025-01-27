package Program_63 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[(Byte,Char), T_A], Char]) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_C, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(CC_A(CC_A(_)), CC_A(_))