package Program_30 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[Byte, E], b: T_A[D, E], c: E) extends T_A[D, E]
case class CC_B[F, G]() extends T_A[F, G]
case class CC_C[I, H]() extends T_A[I, H]
case class CC_D(a: ((Byte,Char),Boolean), b: T_A[Char, (Boolean,Boolean)]) extends T_B[CC_B[Boolean, Byte]]
case class CC_E[J, K](a: CC_C[J, K], b: Int, c: (CC_D,Char)) extends T_B[J]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_E(CC_C(), 12, _) => 0 
  case CC_E(CC_C(), _, _) => 1 
  case CC_E(_, _, _) => 2 
  case CC_E(CC_C(), _, (CC_D(_, _),_)) => 3 
  case CC_E(_, 12, _) => 4 
}
}
// This is not matched: (CC_E Boolean Boolean Wildcard Int Wildcard (T_B Boolean))
// This is not matched: (CC_C T_B)