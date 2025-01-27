package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C], c: T_A[C, C]) extends T_A[(T_A[Boolean, Int],T_A[Int, Int]), C]
case class CC_B[D]() extends T_A[(T_A[Boolean, Int],T_A[Int, Int]), D]
case class CC_C[E](a: T_A[E, T_A[Char, E]]) extends T_A[(T_A[Boolean, Int],T_A[Int, Int]), E]

val v_a: T_A[(T_A[Boolean, Int],T_A[Int, Int]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}