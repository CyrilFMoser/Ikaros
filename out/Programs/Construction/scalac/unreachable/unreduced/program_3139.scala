package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Int], T_B[(Char,Boolean), Char]]) extends T_A[T_B[Boolean, T_B[Byte, Boolean]]]
case class CC_B(a: CC_A, b: Int) extends T_A[T_B[Boolean, T_B[Byte, Boolean]]]
case class CC_C[D]() extends T_A[D]
case class CC_D(a: CC_C[((Byte,Byte),Boolean)], b: T_B[CC_A, ((Char,Char),CC_A)]) extends T_B[T_A[(CC_A,CC_B)], CC_C[Boolean]]

val v_a: T_A[T_B[Boolean, T_B[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()