package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[E, F](a: F) extends T_A[E, F]
case class CC_C() extends T_A[((Byte,Byte),T_B), T_B]

val v_a: CC_B[Boolean, T_A[((Byte,Byte),T_B), T_B]] = null
val v_b: Int = v_a match{
  case CC_B(CC_C()) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))