package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Byte, C]
case class CC_B[D](a: T_A[Byte, D], b: T_A[D, D]) extends T_A[Byte, D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
}
}
// This is not matched: (CC_C (T_B (CC_B Int Byte Boolean Boolean Boolean)))