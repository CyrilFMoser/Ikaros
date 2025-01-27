package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean, b: T_A[(Byte,Char), T_A[Char, Byte]]) extends T_A[Boolean, T_A[T_A[Byte, Int], Int]]
case class CC_B(a: Char, b: CC_A) extends T_A[Boolean, T_A[T_A[Byte, Int], Int]]
case class CC_C(a: Boolean) extends T_A[Boolean, T_A[T_A[Byte, Int], Int]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_) => 3 
}
}