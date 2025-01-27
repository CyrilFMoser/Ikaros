package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[G, F](a: F) extends T_A[G, F]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B Boolean (T_A Boolean))