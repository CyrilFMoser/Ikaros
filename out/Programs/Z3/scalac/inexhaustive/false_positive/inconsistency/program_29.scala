package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B() extends T_A[Boolean]
case class CC_C[D](a: D, b: T_A[D]) extends T_B[D]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0, _) => 0 
}
}
// This is not matched: (CC_B T_B)