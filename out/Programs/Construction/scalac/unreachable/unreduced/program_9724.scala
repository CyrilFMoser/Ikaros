package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[(T_A[Char, Boolean],T_A[Int, Byte]), C]
case class CC_B[D](a: Char) extends T_A[(T_A[Char, Boolean],T_A[Int, Byte]), D]

val v_a: T_A[(T_A[Char, Boolean],T_A[Int, Byte]), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}