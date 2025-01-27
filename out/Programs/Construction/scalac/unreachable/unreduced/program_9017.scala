package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Boolean]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}