package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: Boolean, c: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B(a: T_A[(T_B,T_B), Char], b: (T_A[T_B, T_B],Byte)) extends T_B
case class CC_C(a: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(true) => 1 
  case CC_C(false) => 2 
}
}