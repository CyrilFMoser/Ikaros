package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Char,Boolean)]], b: T_A[T_A[Boolean]]) extends T_A[T_A[(Byte,Char)]]
case class CC_B(a: CC_A, b: T_A[Int]) extends T_A[T_A[(Byte,Char)]]
case class CC_C(a: CC_A, b: Byte) extends T_A[T_A[(Byte,Char)]]

val v_a: T_A[T_A[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _), _)