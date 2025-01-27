package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[Byte], b: B, c: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_D (CC_B Byte Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_B Byte Boolean Boolean Boolean Boolean)))