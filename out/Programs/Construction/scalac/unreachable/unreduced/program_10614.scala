package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Char, Byte], T_A[Int, Char]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Char, Byte], T_A[Int, Char]], D]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Int, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}