package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, E](a: (Char,Byte)) extends T_A[F, E]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: (CC_D Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B Boolean (Tuple (CC_C T_A T_A T_A) (CC_B T_A T_A T_A T_A))))