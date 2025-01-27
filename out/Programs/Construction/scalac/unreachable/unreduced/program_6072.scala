package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[Byte, T_A[Int, Boolean]], C]
case class CC_B[D]() extends T_A[T_A[Byte, T_A[Int, Boolean]], D]
case class CC_C[E, F](a: Int) extends T_A[T_A[Byte, T_A[Int, Boolean]], E]

val v_a: T_A[T_A[Byte, T_A[Int, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(12) => 2 
  case CC_C(_) => 3 
}
}