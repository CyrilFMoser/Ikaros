package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: D) extends T_A[D]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A (T_A (Tuple Int Int)))