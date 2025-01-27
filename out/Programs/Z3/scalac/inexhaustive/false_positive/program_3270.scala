package Program_13 

object Test {
sealed trait T_A[A]
case class CC_C[E](a: E) extends T_A[E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_D Boolean Wildcard Boolean T_B)