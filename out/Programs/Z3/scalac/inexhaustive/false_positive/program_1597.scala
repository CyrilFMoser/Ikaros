package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, G](a: (Char,Int)) extends T_A[G, F]

val v_a: CC_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_A)