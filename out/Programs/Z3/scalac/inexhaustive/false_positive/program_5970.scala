package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: Byte) extends T_A[E, (Byte,(Int,Byte))]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_C Int Wildcard Wildcard (T_A Int))