package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B, b: Byte) extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants