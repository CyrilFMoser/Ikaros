package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[Char, D], b: T_A[D, D], c: D) extends T_A[CC_A[T_A[Int, Boolean]], D]
case class CC_C[E]() extends T_A[E, T_A[E, E]]

val v_a: T_A[CC_A[T_A[Int, Boolean]], T_A[CC_A[T_A[Int, Boolean]], CC_A[T_A[Int, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
  case CC_C() => 2 
}
}