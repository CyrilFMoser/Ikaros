package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B) extends T_A[B]
case class CC_B[C, D](a: (Boolean,Byte)) extends T_A[C]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(_, _) => 1 
  case CC_A(CC_B(_), _) => 2 
}
}
// This is not matched: (CC_B Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants