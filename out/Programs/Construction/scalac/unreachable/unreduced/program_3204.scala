package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Char,Int), Boolean], T_A[Byte, Int]], b: T_A[Char, T_A[Byte, Byte]], c: T_A[T_A[Boolean, Byte], T_A[(Byte,Int), Boolean]]) extends T_A[Byte, T_A[Boolean, T_A[Boolean, Boolean]]]
case class CC_B[C](a: C) extends T_A[CC_A, C]
case class CC_C[D](a: Boolean) extends T_A[CC_A, D]

val v_a: T_A[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_C(_) => 1 
}
}