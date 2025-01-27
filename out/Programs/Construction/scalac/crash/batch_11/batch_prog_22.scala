package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B() extends T_B
case class CC_C() extends T_B
case class CC_D(a: T_A[T_B, CC_A[Char]]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
}
}