package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Byte, b: T_B[D, D]) extends T_A[D]
case class CC_B() extends T_B[CC_A[Byte], T_A[Char]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants