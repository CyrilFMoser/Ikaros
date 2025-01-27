package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Boolean]]) extends T_A[T_A[(Byte,Byte)]]
case class CC_B(a: CC_A, b: Byte) extends T_A[T_A[(Byte,Byte)]]
case class CC_C(a: Int, b: Int, c: CC_A) extends T_A[T_A[(Byte,Byte)]]

val v_a: T_A[T_A[(Byte,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _), _)