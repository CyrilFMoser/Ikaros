package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Char]
case class CC_B[C]() extends T_A[C]
case class CC_D[E](a: T_A[Char]) extends T_B[E]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_B()) => 0 
}
}
// This is not matched: CC_A(CC_B())