package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Boolean]
case class CC_B[D](a: T_A[T_A[D, Boolean], D], b: T_A[D, Boolean], c: D) extends T_A[D, Boolean]
case class CC_C[E](a: E, b: Boolean) extends T_A[E, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}