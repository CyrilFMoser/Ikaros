package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_C[I](a: (Char,Char)) extends T_A[T_A[Boolean, Byte], I]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C((_,'x')) => 0 
}
}
// This is not matched: (CC_B T_A)