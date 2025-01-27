package Program_14 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: (Boolean,Char), b: T_A[D], c: C) extends T_A[C]
case class CC_B[E](a: T_A[E], b: E, c: Byte) extends T_A[E]
case class CC_C[F](a: T_A[F], b: F, c: F) extends T_B[F]
case class CC_D[G](a: CC_B[G], b: T_B[G], c: CC_C[Byte]) extends T_B[G]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, 0) => 0 
  case CC_B(_, _, _) => 1 
  case CC_B(CC_A(_, _, _), _, _) => 2 
  case CC_A(_, _, 0) => 3 
  case CC_A((_,_), CC_B(_, _, _), _) => 4 
  case CC_A((_,'x'), _, _) => 5 
  case CC_A((_,_), CC_A(_, _, _), _) => 6 
  case CC_A(_, CC_A(_, _, _), _) => 7 
  case CC_A((_,'x'), CC_A(_, _, _), _) => 8 
  case CC_A((_,_), CC_A(_, _, _), 0) => 9 
  case CC_A(_, CC_A(_, _, _), 0) => 10 
  case CC_A((_,'x'), CC_A(_, _, _), 0) => 11 
  case CC_A((_,_), _, _) => 12 
  case CC_A(_, CC_B(_, _, _), _) => 13 
  case CC_A((_,'x'), _, 0) => 14 
  case CC_A((_,'x'), CC_B(_, _, _), _) => 15 
  case CC_A((_,'x'), CC_B(_, _, _), 0) => 16 
  case CC_A(_, CC_B(_, _, _), 0) => 17 
  case CC_A((_,_), CC_B(_, _, _), 0) => 18 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))
// This is not matched: Pattern match is empty without constants