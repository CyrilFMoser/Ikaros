package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Boolean],T_B[(Int,Char)])) extends T_A[C]
case class CC_B[D](a: D) extends T_A[D]
case class CC_C[E](a: CC_A[E], b: CC_A[E], c: T_A[T_A[E]]) extends T_A[E]
case class CC_D(a: Boolean) extends T_B[(T_A[Char],Char)]
case class CC_E() extends T_B[(T_A[Char],Char)]

val v_a: T_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),_)) => 0 
  case CC_A((CC_B(_),_)) => 1 
  case CC_A((CC_C(_, _, _),_)) => 2 
  case CC_B(CC_E()) => 3 
  case CC_C(CC_A((_,_)), CC_A(_), CC_A((_,_))) => 4 
  case CC_C(CC_A((_,_)), CC_A(_), CC_B(CC_A(_))) => 5 
  case CC_C(CC_A((_,_)), CC_A(_), CC_B(CC_B(_))) => 6 
  case CC_C(CC_A((_,_)), CC_A(_), CC_B(CC_C(_, _, _))) => 7 
  case CC_C(CC_A((_,_)), CC_A(_), CC_C(_, _, _)) => 8 
}
}