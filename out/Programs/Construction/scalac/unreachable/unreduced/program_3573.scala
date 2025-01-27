package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C[E](a: (CC_A[Boolean],CC_A[Int]), b: T_A[E, T_A[E, E]], c: T_A[E, E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C((CC_A(_),CC_A(_)), CC_A(_), _) => 2 
  case CC_C((CC_A(_),CC_A(_)), CC_B(), _) => 3 
  case CC_C((CC_A(_),CC_A(_)), CC_C(_, _, _), _) => 4 
}
}