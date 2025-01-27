package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: Byte, b: T_A[D, D]) extends T_A[D, T_B]

val v_a: T_A[Int, T_B] = null
val v_b: Int = v_a match{
  case CC_B(0, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants