package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: T_A[C, C]) extends T_A[T_A[T_A[Char, Char], T_A[Int, Boolean]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Char, Char], T_A[Int, Boolean]], D]
case class CC_C(a: T_A[CC_B[Char], Byte], b: CC_B[Char]) extends T_A[T_A[T_A[Char, Char], T_A[Int, Boolean]], CC_A[T_A[(Boolean,Boolean), Byte]]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}