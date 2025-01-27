package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[(T_A[Boolean, Byte],((Char,Boolean),Int)), C]
case class CC_B[D]() extends T_A[(T_A[Boolean, Byte],((Char,Boolean),Int)), D]
case class CC_C(a: Char, b: T_A[CC_B[Byte], Char]) extends T_A[(T_A[Boolean, Byte],((Char,Boolean),Int)), CC_A[Byte]]

val v_a: T_A[(T_A[Boolean, Byte],((Char,Boolean),Int)), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}