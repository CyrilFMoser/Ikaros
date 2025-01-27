package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: Boolean) extends T_A[C, T_A[T_B, T_B]]
case class CC_B(a: (T_A[T_B, (Boolean,Char)],Char), b: T_A[T_B, T_A[T_B, T_B]]) extends T_A[T_B, T_A[T_B, T_B]]
case class CC_C(a: CC_A[Char]) extends T_B

val v_a: T_A[T_B, T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((_,_), CC_A(_, _)) => 1 
  case CC_B((_,_), CC_B(_, _)) => 2 
}
}