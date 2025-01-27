package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Boolean,Char), b: (Boolean,T_B[T_A, (Int,Char)]), c: T_B[T_A, T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B, b: CC_B, c: (T_A,Char)) extends T_A
case class CC_D[C](a: Byte, b: CC_B, c: (Char,T_B[Char, T_A])) extends T_B[CC_B, C]
case class CC_E[D]() extends T_B[CC_B, D]
case class CC_F[E](a: CC_D[E], b: T_A, c: (T_B[CC_B, T_A],Char)) extends T_B[CC_B, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,'x'), (_,_), _) => 0 
  case CC_A((_,_), (_,_), _) => 1 
  case CC_C(_, _, (CC_A(_, _, _),_)) => 2 
  case CC_C(_, _, (CC_B(),_)) => 3 
  case CC_C(_, _, (CC_C(_, _, _),_)) => 4 
}
}
// This is not matched: CC_B()