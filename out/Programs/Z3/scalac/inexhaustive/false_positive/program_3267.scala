package Program_13 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, D], b: T_A[Int, Int], c: T_A[D, C]) extends T_A[C, D]
case class CC_B[E](a: T_A[E, E], b: CC_A[E, (Boolean,Byte)], c: Boolean) extends T_A[T_A[Byte, (Char,Char)], E]
case class CC_C[F, G](a: (Char,Char), b: G, c: CC_B[F]) extends T_A[T_A[Byte, (Char,Char)], F]

val v_a: T_A[T_A[Byte, (Char,Char)], Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), _) => 1 
  case CC_B(_, CC_A(_, _, _), _) => 2 
  case CC_C(_, _, CC_B(_, _, _)) => 3 
  case CC_A(_, CC_A(_, _, _), _) => 4 
}
}
// This is not matched: (CC_C Byte
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_A Byte (Tuple Char Char)) Byte))
// This is not matched: (CC_B (T_A T_B))