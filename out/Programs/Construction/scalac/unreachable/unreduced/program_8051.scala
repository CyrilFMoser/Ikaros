package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, T_B], T_B], b: T_B) extends T_A[T_B, T_B]
case class CC_B[C](a: T_B, b: CC_A) extends T_A[T_B, T_B]
case class CC_C() extends T_A[T_B, T_B]
case class CC_D(a: (((Byte,Char),Char),CC_B[(Char,Byte)]), b: T_A[Boolean, (T_B,CC_A)], c: CC_A) extends T_B
case class CC_E(a: T_B, b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A(_, _)) => 0 
  case CC_E(_, _) => 1 
}
}