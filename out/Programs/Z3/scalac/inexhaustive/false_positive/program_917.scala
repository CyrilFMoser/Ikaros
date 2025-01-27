package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[T_A[Byte]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      (Tuple (CC_B (CC_A Boolean Wildcard Wildcard T_A) T_A) Wildcard)
//      Wildcard
//      T_A)