package Program_10 

object Test {
sealed trait T_A[A]
case class CC_B[E](a: T_A[Int]) extends T_A[E]
case class CC_C[F]() extends T_A[F]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_C()) => 0 
}
}
// This is not matched: (CC_C Wildcard (T_A (CC_A Byte Boolean)))