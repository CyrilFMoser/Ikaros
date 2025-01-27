package Program_12 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[Byte], b: T_A[D], c: T_A[Char]) extends T_B[D]
case class CC_C[E, F](a: Int, b: T_B[E], c: CC_B[E]) extends T_B[E]
case class CC_D() extends T_B[CC_B[Byte]]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(12, CC_B(_, _, _), CC_B(_, _, _)) => 0 
  case CC_C(_, CC_B(_, _, _), _) => 1 
  case CC_C(_, _, _) => 2 
  case CC_B(CC_B(_, _, _), _, CC_A()) => 3 
  case CC_B(CC_C(_, _, _), _, CC_A()) => 4 
}
}
// This is not matched: (CC_C Byte (CC_A Boolean Boolean) Wildcard Wildcard Wildcard (T_B Byte))
// This is not matched: (CC_D (Tuple Wildcard (CC_C T_B)) T_B)