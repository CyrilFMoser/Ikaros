package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C, c: T_B) extends T_A[T_A[(T_B,Byte), T_A[(Byte,Int), Byte]], C]
case class CC_B(a: T_B, b: T_A[T_A[T_B, T_B], (Boolean,Byte)], c: Byte) extends T_B
case class CC_C(a: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}