package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Boolean, C]) extends T_A[Boolean, C]
case class CC_B[D](a: D, b: T_A[D, D], c: D) extends T_A[Boolean, D]
case class CC_C[E]() extends T_A[T_A[Boolean, T_A[Boolean, Byte]], E]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, _, _)) => 2 
  case CC_B(_, _, _) => 3 
}
}