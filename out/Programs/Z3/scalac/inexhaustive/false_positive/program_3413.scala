package Program_15 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: Boolean) extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants