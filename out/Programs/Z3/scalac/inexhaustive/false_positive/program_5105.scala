package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int, b: T_B[Char, Byte]) extends T_A[T_A[Boolean]]
case class CC_B() extends T_A[T_A[Boolean]]
case class CC_C() extends T_A[T_A[Boolean]]
case class CC_D() extends T_B[T_B[CC_A, CC_B], CC_C]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(12, _) => 1 
  case CC_C() => 2 
}
}
// This is not matched: (CC_B Wildcard T_A)