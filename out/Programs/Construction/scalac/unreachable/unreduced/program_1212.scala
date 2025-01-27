package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[(Boolean,Byte), (Boolean,Char)], Boolean]]
case class CC_B[D](a: Byte) extends T_A[D, T_A[T_A[(Boolean,Byte), (Boolean,Char)], Boolean]]
case class CC_C[E](a: Boolean, b: CC_B[E]) extends T_A[E, T_A[T_A[(Boolean,Byte), (Boolean,Char)], Boolean]]

val v_a: T_A[Byte, T_A[T_A[(Boolean,Byte), (Boolean,Char)], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}