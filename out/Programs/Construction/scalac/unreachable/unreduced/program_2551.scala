package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Byte,Byte), T_A[Boolean, Int]], b: T_A[T_A[Boolean, Byte], Boolean]) extends T_A[T_A[T_A[Byte, Boolean], Boolean], T_A[T_A[Byte, Boolean], T_A[Char, Int]]]
case class CC_B[C](a: CC_A, b: Int, c: T_A[T_A[C, C], C]) extends T_A[(T_A[Char, CC_A],CC_A), C]
case class CC_C[D]() extends T_A[(T_A[Char, CC_A],CC_A), D]

val v_a: T_A[(T_A[Char, CC_A],CC_A), Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
  case CC_C() => 1 
}
}