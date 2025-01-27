package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E, F]() extends T_A[F, E]
case class CC_C(a: T_A[(Boolean,Int), Int], b: CC_A[Byte, Byte], c: T_A[(Boolean,Char), Boolean]) extends T_A[CC_B[Int, Boolean], Byte]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_B T_A) T_A)