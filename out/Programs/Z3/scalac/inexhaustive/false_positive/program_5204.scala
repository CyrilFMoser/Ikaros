package Program_13 

object Test {
sealed trait T_A[A]
case class CC_B[C]() extends T_A[C]
case class CC_C[D](a: T_A[D], b: Byte, c: T_A[D]) extends T_A[D]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
}
}
// This is not matched: (CC_C Int Wildcard Wildcard (CC_A Int (T_A Int)) (T_A Int))