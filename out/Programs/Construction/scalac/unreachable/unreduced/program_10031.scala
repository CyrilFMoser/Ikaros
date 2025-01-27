package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[T_A[(Char,Int), Int], Boolean], C]
case class CC_B[E](a: E, b: T_A[E, E], c: E) extends T_A[T_A[T_A[(Char,Int), Int], Boolean], E]
case class CC_C[F]() extends T_A[T_A[T_A[(Char,Int), Int], Boolean], F]

val v_a: T_A[T_A[T_A[(Char,Int), Int], Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}