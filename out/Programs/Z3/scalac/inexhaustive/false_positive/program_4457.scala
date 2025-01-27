package Program_14 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[D], c: ((Byte,Boolean),Int)) extends T_A[T_B[Char], D]
case class CC_B[E](a: E, b: CC_A[E], c: CC_A[E]) extends T_A[T_B[Char], E]
case class CC_C[F, G]() extends T_B[F]
case class CC_D[H](a: T_B[H], b: T_B[H], c: T_A[H, Boolean]) extends T_B[H]

val v_a: T_A[T_B[Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _), CC_C(), ((_,_),_)) => 0 
  case CC_A(CC_D(_, _, _), CC_D(_, _, _), ((_,_),12)) => 1 
  case CC_A(_, CC_D(_, _, _), ((_,_),_)) => 2 
  case CC_A(_, CC_D(_, _, _), ((_,_),12)) => 3 
  case CC_A(CC_D(_, _, _), _, ((_,_),_)) => 4 
  case CC_A(_, _, ((_,_),12)) => 5 
  case CC_A(CC_C(), _, ((_,_),_)) => 6 
  case CC_A(CC_C(), CC_D(_, _, _), _) => 7 
  case CC_B(_, CC_A(_, _, _), _) => 8 
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 9 
  case CC_B(0, CC_A(_, _, _), _) => 10 
  case CC_B(0, _, _) => 11 
  case CC_B(_, _, _) => 12 
}
}
// This is not matched: (CC_A Byte
//      (CC_C Byte Boolean (T_B Byte))
//      (CC_C Byte (T_B Boolean) (T_B Byte))
//      (Tuple Wildcard Wildcard)
//      (T_A (T_B Char) Byte))
// This is not matched: (CC_D (CC_A Boolean) Byte Wildcard Wildcard (T_B (CC_A Boolean) Byte))