package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char, c: T_A[C, C]) extends T_A[T_A[(Byte,Boolean), T_A[Char, Char]], C]
case class CC_B[D]() extends T_A[T_A[(Byte,Boolean), T_A[Char, Char]], D]
case class CC_C(a: CC_A[Boolean], b: CC_B[CC_B[Int]]) extends T_A[T_A[(Byte,Boolean), T_A[Char, Char]], CC_A[T_A[Byte, Int]]]

val v_a: T_A[T_A[(Byte,Boolean), T_A[Char, Char]], T_A[T_A[(Byte,Boolean), T_A[Char, Char]], CC_A[T_A[Byte, Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}