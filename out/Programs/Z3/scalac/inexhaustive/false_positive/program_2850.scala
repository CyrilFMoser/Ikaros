package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G](a: T_A[E, (Boolean,Char)], b: T_A[G, G], c: G) extends T_A[F, E]
case class CC_B[H](a: CC_A[H, H, H]) extends T_A[H, T_A[Byte, Boolean]]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
  case CC_A(CC_A(_, _, _), CC_B(_), _) => 3 
  case CC_A(_, CC_B(_), _) => 4 
}
}
// This is not matched: (CC_A Byte Int Boolean Wildcard Wildcard Wildcard (T_A Int Byte))
// This is not matched: (CC_C (T_A (T_A Char Boolean) (T_A Int Char)))