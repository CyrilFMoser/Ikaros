package Program_14 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: E) extends T_A[D, C]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Byte Boolean Wildcard (T_A Byte Boolean))
// This is not matched: (CC_D Wildcard T_B)