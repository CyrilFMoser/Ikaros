package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, Char]) extends T_A[C, T_B]
case class CC_B[D](a: T_A[D, T_B], b: Byte, c: ((T_B,(Int,Byte)),Boolean)) extends T_A[D, T_B]
case class CC_C[E]() extends T_A[E, T_B]
case class CC_D(a: (T_A[T_B, T_B],T_A[T_B, T_B])) extends T_B

val v_a: T_A[Boolean, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, ((_,_),true)) => 1 
  case CC_B(_, _, ((_,_),false)) => 2 
  case CC_C() => 3 
}
}