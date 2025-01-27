package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[C, C], C]) extends T_A[Byte, C]
case class CC_B(a: Int, b: Int) extends T_A[Byte, T_A[T_A[Boolean, Int], T_A[Char, Int]]]

val v_a: T_A[Byte, T_A[T_A[Boolean, Int], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(12, _) => 1 
  case CC_B(_, _) => 2 
}
}