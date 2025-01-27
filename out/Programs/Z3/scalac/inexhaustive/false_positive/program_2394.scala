package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_B Wildcard Wildcard T_A) (CC_A Boolean Wildcard T_A))
//      Wildcard
//      T_A)