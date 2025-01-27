package Program_12 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C) extends T_A[C]
case class CC_B[D](a: T_A[D]) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_B Boolean))
// This is not matched: Pattern match is empty without constants