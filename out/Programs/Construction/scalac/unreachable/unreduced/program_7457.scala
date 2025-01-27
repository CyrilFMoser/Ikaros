package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[T_A[T_A[Int, Int], Boolean], C]
case class CC_B[D]() extends T_A[T_A[T_A[Int, Int], Boolean], D]
case class CC_C[E](a: Boolean) extends T_A[T_A[T_A[Int, Int], Boolean], E]

val v_a: T_A[T_A[T_A[Int, Int], Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}