package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C]) extends T_A[T_B[Byte]]
case class CC_B[D](a: Boolean, b: (Int,Boolean), c: T_B[D]) extends T_B[D]
case class CC_C[E](a: T_A[E], b: Char, c: (Char,Char)) extends T_B[E]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_), CC_C(_, _, _)) => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
  case CC_B(_, (12,_), _) => 2 
  case CC_B(_, (_,_), CC_B(_, _, _)) => 3 
  case CC_B(_, (12,_), CC_B(_, _, _)) => 4 
  case CC_B(_, _, CC_C(_, _, _)) => 5 
  case CC_B(_, (_,_), _) => 6 
  case CC_C(_, 'x', _) => 7 
}
}
// This is not matched: (CC_C Char Wildcard Char Wildcard (T_B Char))
// This is not matched: Pattern match is empty without constants