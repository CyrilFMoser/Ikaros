package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[Byte, T_A[Byte, Byte]], b: T_A[Int, (Char,Char)]) extends T_A[(T_A[Boolean, Byte],T_A[Byte, Byte]), T_A[(T_A[Boolean, Byte],T_A[Byte, Byte]), (T_A[Boolean, Byte],T_A[Byte, Byte])]]
case class CC_C[D]() extends T_A[D, T_A[D, D]]

val v_a: T_A[(T_A[Boolean, Byte],T_A[Byte, Byte]), T_A[(T_A[Boolean, Byte],T_A[Byte, Byte]), (T_A[Boolean, Byte],T_A[Byte, Byte])]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}