package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), T_A], b: T_B[(T_A,Char), T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Byte, b: T_B[CC_B, (T_A,CC_B)]) extends T_A
case class CC_D(a: CC_A, b: CC_A, c: T_A) extends T_B[Char, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _)