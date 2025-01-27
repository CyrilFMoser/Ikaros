package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Int) extends T_A[B]
case class CC_B[C, D]() extends T_A[C]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), 12) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_A(CC_A(_, _), _) => 2 
  case CC_A(_, 12) => 3 
}
}
// This is not matched: (CC_A Boolean (CC_B Boolean Boolean (T_A Boolean)) Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants