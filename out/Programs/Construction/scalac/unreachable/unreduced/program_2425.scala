package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[Boolean, T_A[Char, Int]]
case class CC_B(a: (T_B[CC_A],CC_A), b: T_B[CC_A]) extends T_A[Boolean, T_A[Char, Int]]
case class CC_C() extends T_A[Boolean, T_A[Char, Int]]
case class CC_D(a: CC_A, b: T_B[CC_A]) extends T_B[(T_A[CC_C, Char],(CC_C,CC_A))]
case class CC_E(a: CC_B, b: CC_D, c: Boolean) extends T_B[(T_A[CC_C, Char],(CC_C,CC_A))]

val v_a: T_A[Boolean, T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_A()), _) => 1 
  case CC_C() => 2 
}
}