package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, T_B[D]]) extends T_A[T_A[Int, T_A[Boolean, Boolean]], D]
case class CC_B(a: Char, b: (CC_A[Int],T_A[Boolean, Byte]), c: T_A[Boolean, T_B[Boolean]]) extends T_A[T_A[Int, T_A[Boolean, Boolean]], CC_A[Char]]
case class CC_C[E]() extends T_A[T_A[Int, T_A[Boolean, Boolean]], E]

val v_a: T_A[T_A[Int, T_A[Boolean, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}