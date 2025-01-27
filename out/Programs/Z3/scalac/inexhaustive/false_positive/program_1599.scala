package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Char) extends T_A[D, E]
case class CC_B[G, F, H]() extends T_A[F, G]
case class CC_C[I](a: I) extends T_A[I, Byte]
case class CC_D[J](a: CC_A[J, J], b: J) extends T_B[J]
case class CC_E(a: Int, b: T_B[Byte], c: T_A[Byte, Boolean]) extends T_B[Byte]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(12, CC_E(_, _, _), CC_A(_)) => 0 
  case CC_E(_, CC_D(_, _), CC_A(_)) => 1 
  case CC_E(_, CC_E(_, _, _), _) => 2 
  case CC_E(_, CC_E(_, _, _), CC_B()) => 3 
  case CC_E(_, _, CC_B()) => 4 
}
}
// This is not matched: (CC_E Int
//      (CC_D Byte Wildcard Wildcard (T_B Byte))
//      (CC_B Boolean Byte Boolean (T_A Byte Boolean))
//      (T_B Byte))
// This is not matched: (CC_D Boolean Int (T_B Boolean (T_B (CC_B T_A T_A T_A) (CC_B T_A T_A T_A))))