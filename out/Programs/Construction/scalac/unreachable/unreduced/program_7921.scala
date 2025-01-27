package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: T_A[T_B, C]) extends T_A[C, T_A[T_A[T_B, T_B], T_A[T_B, Char]]]
case class CC_B(a: Byte, b: T_A[T_A[T_B, T_B], (T_B,T_B)]) extends T_B
case class CC_C(a: (((Byte,Int),T_B),Char)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(((_,_),_)) => 1 
}
}