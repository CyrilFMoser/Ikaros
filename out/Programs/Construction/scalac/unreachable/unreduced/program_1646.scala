package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Boolean]], C]
case class CC_B[D](a: T_A[Byte, D], b: D, c: T_A[D, D]) extends T_A[T_A[T_A[Int, Int], T_A[Byte, Boolean]], D]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Byte, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}