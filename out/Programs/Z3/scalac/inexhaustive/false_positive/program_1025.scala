package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: Int, c: D) extends T_A[Boolean]
case class CC_B[E, F](a: (Byte,Byte)) extends T_B[E, F]
case class CC_C[H, G](a: Int, b: G, c: Boolean) extends T_B[H, G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(_, 12, _) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_C Wildcard Wildcard T_A)