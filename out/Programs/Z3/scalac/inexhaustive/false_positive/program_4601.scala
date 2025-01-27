package Program_14 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Byte, Int], b: T_A[Boolean, (Char,Boolean)], c: (Byte,Byte)) extends T_A[T_A[Char, Byte], T_A[Char, Byte]]
case class CC_B(a: CC_A, b: T_A[CC_A, CC_A], c: (CC_A,CC_A)) extends T_A[T_A[Char, Byte], T_A[Char, Byte]]
case class CC_C[D, C, E](a: T_A[E, C], b: T_A[D, E]) extends T_A[C, D]

val v_a: T_A[T_A[Char, Byte], T_A[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _), (_,0)) => 0 
  case CC_A(CC_C(_, _), CC_C(_, _), _) => 1 
  case CC_A(_, _, (_,0)) => 2 
  case CC_A(CC_C(_, _), CC_C(_, _), (_,0)) => 3 
  case CC_A(CC_C(_, _), CC_C(_, _), (_,_)) => 4 
  case CC_A(CC_C(_, _), _, (_,_)) => 5 
  case CC_A(CC_C(_, _), CC_C(_, _), (0,_)) => 6 
  case CC_A(_, _, _) => 7 
  case CC_A(_, _, (0,0)) => 8 
  case CC_A(CC_C(_, _), _, (_,0)) => 9 
  case CC_B(_, _, (CC_A(_, _, _),CC_A(_, _, _))) => 10 
  case CC_B(CC_A(_, _, _), _, (CC_A(_, _, _),CC_A(_, _, _))) => 11 
  case CC_B(CC_A(_, _, _), _, _) => 12 
  case CC_C(CC_C(_, _), CC_B(_, _, _)) => 13 
  case CC_C(_, CC_A(_, _, _)) => 14 
  case CC_C(CC_A(_, _, _), CC_B(_, _, _)) => 15 
  case CC_C(CC_A(_, _, _), CC_C(_, _)) => 16 
  case CC_C(_, CC_C(_, _)) => 17 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _)) => 18 
  case CC_C(CC_A(_, _, _), _) => 19 
}
}
// This is not matched: (CC_C (T_A Char Byte)
//      (T_A Char Byte)
//      (T_A Boolean Boolean)
//      Wildcard
//      Wildcard
//      (T_A (T_A Char Byte) (T_A Char Byte)))
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Char (Tuple Boolean Int)) (T_A Char Char)))