package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Char, Byte], T_A[Boolean, Boolean]], b: Boolean, c: T_A[T_A[Boolean, Boolean], T_A[Byte, Boolean]]) extends T_A[T_A[Byte, T_A[Int, Char]], Boolean]
case class CC_B() extends T_A[T_A[Byte, T_A[Int, Char]], Boolean]

val v_a: T_A[T_A[Byte, T_A[Int, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}