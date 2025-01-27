package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]
case class CC_B[C, D](a: D) extends T_A[C]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_B Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants