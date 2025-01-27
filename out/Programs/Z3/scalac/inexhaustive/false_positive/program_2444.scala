package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_D[G](a: T_B[G, Char], b: T_A[G]) extends T_B[CC_B[Byte], G]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A()) => 0 
}
}
// This is not matched: (CC_B Char Int (T_A Int Char))