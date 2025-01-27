package Program_8 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_A[C], c: Boolean) extends T_A[C]
case class CC_B[D](a: Byte, b: (Byte,Char), c: T_A[D]) extends T_A[D]
case class CC_C[E, F](a: T_A[E], b: T_A[F], c: Boolean) extends T_A[E]
case class CC_D[G](a: Char, b: CC_A[G]) extends T_B[G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _, _), _) => 0 
  case CC_A(CC_D(_, _), CC_A(_, _, _), _) => 1 
  case CC_A(CC_D(_, _), _, _) => 2 
  case CC_A(_, CC_B(_, _, _), _) => 3 
  case CC_C(CC_A(_, _, _), _, _) => 4 
  case CC_C(CC_B(_, _, _), CC_B(_, _, _), _) => 5 
  case CC_C(CC_C(_, _, _), CC_C(_, _, _), _) => 6 
  case CC_C(_, CC_C(_, _, _), _) => 7 
  case CC_C(CC_A(_, _, _), CC_C(_, _, _), _) => 8 
  case CC_C(_, CC_B(_, _, _), _) => 9 
  case CC_C(CC_C(_, _, _), CC_B(_, _, _), _) => 10 
  case CC_C(CC_B(_, _, _), CC_A(_, _, _), _) => 11 
  case CC_C(CC_B(_, _, _), CC_C(_, _, _), _) => 12 
  case CC_C(_, CC_A(_, _, _), _) => 13 
  case CC_B(_, (0,'x'), CC_B(_, _, _)) => 14 
  case CC_B(_, (_,'x'), _) => 15 
  case CC_B(0, (0,'x'), CC_C(_, _, _)) => 16 
  case CC_B(0, (_,'x'), CC_B(_, _, _)) => 17 
  case CC_B(0, (_,'x'), _) => 18 
  case CC_B(_, (_,_), CC_C(_, _, _)) => 19 
  case CC_B(0, (0,'x'), _) => 20 
  case CC_B(0, _, CC_C(_, _, _)) => 21 
  case CC_B(_, _, CC_B(_, _, _)) => 22 
  case CC_B(_, (_,'x'), CC_C(_, _, _)) => 23 
  case CC_B(0, _, _) => 24 
  case CC_B(_, (_,'x'), CC_B(_, _, _)) => 25 
  case CC_B(_, (0,_), CC_A(_, _, _)) => 26 
  case CC_B(0, (0,_), CC_A(_, _, _)) => 27 
  case CC_B(0, (0,'x'), CC_A(_, _, _)) => 28 
  case CC_B(_, (_,_), CC_B(_, _, _)) => 29 
  case CC_B(_, (0,'x'), CC_A(_, _, _)) => 30 
  case CC_B(_, (0,'x'), CC_C(_, _, _)) => 31 
  case CC_B(0, (_,_), CC_C(_, _, _)) => 32 
  case CC_B(_, (0,_), CC_C(_, _, _)) => 33 
  case CC_B(_, (_,_), CC_A(_, _, _)) => 34 
  case CC_B(_, (0,'x'), _) => 35 
  case CC_B(0, (_,'x'), CC_C(_, _, _)) => 36 
  case CC_B(0, (_,'x'), CC_A(_, _, _)) => 37 
  case CC_B(0, (_,_), _) => 38 
  case CC_B(0, _, CC_A(_, _, _)) => 39 
  case CC_B(0, (0,'x'), CC_B(_, _, _)) => 40 
  case CC_B(0, (0,_), CC_B(_, _, _)) => 41 
  case CC_B(_, (_,'x'), CC_A(_, _, _)) => 42 
  case CC_B(0, (0,_), _) => 43 
  case CC_B(_, _, CC_A(_, _, _)) => 44 
  case CC_B(0, (0,_), CC_C(_, _, _)) => 45 
  case CC_B(_, (_,_), _) => 46 
  case CC_B(_, _, CC_C(_, _, _)) => 47 
}
}
// This is not matched: (CC_C Boolean
//      Char
//      Wildcard
//      (CC_B Char
//            Byte
//            Wildcard
//            (CC_B Char Byte Wildcard Wildcard (T_A Char))
//            (T_A Char))
//      Boolean
//      (T_A Boolean))
// This is not matched: (CC_A (CC_B Wildcard T_A) Wildcard (CC_B Wildcard T_A) T_A)