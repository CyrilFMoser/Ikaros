package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, T_A[C, C]]) extends T_A[T_A[T_A[Int, Boolean], T_A[Byte, Boolean]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Int, Boolean], T_A[Byte, Boolean]], D]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Byte, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}