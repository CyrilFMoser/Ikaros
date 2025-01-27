package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Int]], b: T_A[Int, T_A[Int, (Boolean,Char)]], c: Char) extends T_A[T_A[(Boolean,Byte), T_A[Int, Int]], T_B[T_B[(Boolean,Byte)]]]
case class CC_B[D](a: CC_A) extends T_B[D]
case class CC_C[E]() extends T_B[E]
case class CC_D(a: T_B[Byte], b: T_A[T_B[(Char,Byte)], T_B[Boolean]]) extends T_B[T_A[CC_A, T_A[CC_A, CC_A]]]

val v_a: T_B[T_B[T_A[CC_A, T_A[CC_A, CC_A]]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_), _, _)) => 0 
  case CC_B(CC_A(CC_C(), _, _)) => 1 
  case CC_C() => 2 
}
}