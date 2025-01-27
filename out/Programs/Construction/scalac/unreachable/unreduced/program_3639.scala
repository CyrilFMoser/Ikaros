package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int) extends T_A[T_A[T_A[Int, Int], T_A[Char, Boolean]], C]
case class CC_B[D](a: T_A[D, D], b: CC_A[D], c: D) extends T_A[T_A[T_A[Int, Int], T_A[Char, Boolean]], D]
case class CC_C[E]() extends T_A[T_A[T_A[Int, Int], T_A[Char, Boolean]], E]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Char, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B(_, CC_A(_), _) => 2 
  case CC_C() => 3 
}
}