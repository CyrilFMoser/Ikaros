package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, C], b: T_A[C, Int], c: Byte) extends T_A[C, D]
case class CC_B[E, F](a: E, b: CC_A[F, F]) extends T_A[T_A[Boolean, Byte], E]
case class CC_C[G](a: CC_B[G, G], b: T_A[G, G], c: G) extends T_A[T_A[Boolean, Byte], G]

val v_a: T_A[T_A[Boolean, Byte], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_C(CC_B(_, _), CC_A(_, _, _), _) => 1 
  case CC_C(_, _, _) => 2 
  case CC_C(_, CC_A(_, _, _), _) => 3 
  case CC_C(_, _, 'x') => 4 
  case CC_A(CC_A(_, _, _), _, _) => 5 
  case CC_A(CC_B(_, _), CC_C(_, _, _), 0) => 6 
  case CC_A(CC_A(_, _, _), CC_B(_, _), 0) => 7 
  case CC_A(_, CC_B(_, _), 0) => 8 
  case CC_A(_, CC_C(_, _, _), _) => 9 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), _) => 10 
  case CC_A(CC_C(_, _, _), CC_C(_, _, _), 0) => 11 
  case CC_A(CC_B(_, _), _, _) => 12 
  case CC_A(CC_B(_, _), CC_B(_, _), _) => 13 
  case CC_A(CC_B(_, _), CC_C(_, _, _), _) => 14 
  case CC_A(CC_C(_, _, _), CC_B(_, _), _) => 15 
  case CC_A(CC_A(_, _, _), _, 0) => 16 
  case CC_A(CC_B(_, _), CC_A(_, _, _), _) => 17 
  case CC_A(_, CC_A(_, _, _), _) => 18 
  case CC_A(CC_A(_, _, _), CC_C(_, _, _), 0) => 19 
  case CC_A(CC_B(_, _), CC_A(_, _, _), 0) => 20 
  case CC_A(CC_A(_, _, _), CC_B(_, _), _) => 21 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), 0) => 22 
  case CC_A(CC_C(_, _, _), CC_C(_, _, _), _) => 23 
  case CC_A(_, _, 0) => 24 
  case CC_A(CC_C(_, _, _), _, 0) => 25 
  case CC_A(CC_B(_, _), _, 0) => 26 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 27 
  case CC_A(CC_C(_, _, _), _, _) => 28 
  case CC_A(CC_B(_, _), CC_B(_, _), 0) => 29 
  case CC_A(_, CC_B(_, _), _) => 30 
}
}
// This is not matched: (CC_B Char
//      (T_A Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_A (T_A Boolean Byte) Char))
// This is not matched: (CC_C Wildcard Wildcard Wildcard (T_A Byte))