package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants