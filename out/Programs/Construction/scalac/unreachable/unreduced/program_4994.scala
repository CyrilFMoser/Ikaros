package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: ((Char,T_B),Byte)) extends T_A[C, T_A[C, C]]
case class CC_B(a: (Char,Char), b: Char, c: CC_A[T_B]) extends T_B
case class CC_C(a: CC_A[CC_A[CC_B]], b: (CC_A[T_B],T_B), c: T_B) extends T_B
case class CC_D(a: CC_B, b: T_A[Boolean, T_B], c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A((_,_))) => 0 
  case CC_C(CC_A((_,_)), _, CC_B((_,_), 'x', CC_A(_))) => 1 
  case CC_C(CC_A((_,_)), _, CC_B((_,_), _, CC_A(_))) => 2 
  case CC_C(CC_A((_,_)), _, CC_C(_, _, _)) => 3 
  case CC_C(CC_A((_,_)), _, CC_D(_, _, CC_B(_, _, _))) => 4 
  case CC_D(_, _, CC_B(_, _, _)) => 5 
}
}