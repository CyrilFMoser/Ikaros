package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_C[D](a: Int, b: T_B[D]) extends T_A[D]
case class CC_D() extends T_B[Boolean]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_C(12, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants