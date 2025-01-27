package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_B[D](a: Byte) extends T_A[D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A Int (CC_A Int Wildcard Wildcard (T_A Int)) Wildcard (T_A Int))