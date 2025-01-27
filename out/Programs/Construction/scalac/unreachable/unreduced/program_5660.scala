package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: Int, b: Byte, c: T_B) extends T_A[(Int,T_B), T_B]
case class CC_B[C](a: (T_A[CC_A, T_B],T_B), b: T_A[C, C]) extends T_B
case class CC_C(a: T_B, b: T_B) extends T_B

val v_a: T_A[(Int,T_B), T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B((_,_), _)) => 0 
  case CC_A(_, _, CC_C(CC_B(_, _), _)) => 1 
  case CC_A(_, _, CC_C(CC_C(_, _), _)) => 2 
}
}