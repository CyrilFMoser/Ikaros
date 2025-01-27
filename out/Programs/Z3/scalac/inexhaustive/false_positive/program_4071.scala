package Program_11 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: CC_A[E], b: E) extends T_A[E]
case class CC_C[F, G](a: (Char,Int), b: T_A[G], c: CC_A[G]) extends T_A[F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_B(CC_A(), _) => 2 
  case CC_B(CC_A(), 'x') => 3 
  case CC_B(_, 'x') => 4 
  case CC_C((_,12), CC_B(_, _), CC_A()) => 5 
  case CC_C((_,_), CC_A(), CC_A()) => 6 
  case CC_C(('x',12), _, _) => 7 
  case CC_C(('x',_), CC_A(), CC_A()) => 8 
  case CC_C(_, CC_B(_, _), _) => 9 
  case CC_C((_,_), CC_B(_, _), CC_A()) => 10 
  case CC_C((_,12), CC_C(_, _, _), _) => 11 
  case CC_C((_,_), CC_A(), _) => 12 
  case CC_C(('x',_), _, CC_A()) => 13 
  case CC_C(_, CC_A(), _) => 14 
  case CC_C(('x',_), CC_C(_, _, _), _) => 15 
  case CC_C((_,12), _, _) => 16 
  case CC_C(_, CC_C(_, _, _), CC_A()) => 17 
  case CC_C(('x',_), CC_C(_, _, _), CC_A()) => 18 
  case CC_C((_,12), _, CC_A()) => 19 
  case CC_C(('x',12), CC_C(_, _, _), _) => 20 
  case CC_C(('x',12), CC_A(), CC_A()) => 21 
  case CC_C(('x',12), _, CC_A()) => 22 
  case CC_C(_, CC_A(), CC_A()) => 23 
  case CC_C((_,_), _, CC_A()) => 24 
  case CC_C(('x',_), CC_A(), _) => 25 
  case CC_C(('x',12), CC_B(_, _), _) => 26 
  case CC_C(('x',_), CC_B(_, _), CC_A()) => 27 
  case CC_C(('x',_), _, _) => 28 
  case CC_C((_,_), CC_C(_, _, _), CC_A()) => 29 
  case CC_C(_, _, _) => 30 
  case CC_C((_,_), CC_C(_, _, _), _) => 31 
  case CC_C(_, CC_C(_, _, _), _) => 32 
  case CC_C(('x',12), CC_C(_, _, _), CC_A()) => 33 
}
}
// This is not matched: (CC_C Char
//      Boolean
//      Wildcard
//      (CC_C Boolean
//            (T_A Boolean)
//            Wildcard
//            (CC_A (T_A Boolean) (T_A (T_A Boolean)))
//            Wildcard
//            (T_A Boolean))
//      (CC_A Boolean (T_A Boolean))
//      (T_A Char))
// This is not matched: (CC_A T_A)