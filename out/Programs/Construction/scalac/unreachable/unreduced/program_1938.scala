package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[(Char,Boolean)]) extends T_A[T_B[Int]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D](a: T_B[D], b: T_A[D]) extends T_B[D]
case class CC_D(a: T_B[T_B[CC_A]], b: CC_A, c: CC_B[Boolean]) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _) => 1 
  case CC_C(CC_C(CC_B(), _), _) => 2 
  case CC_C(CC_C(CC_C(_, _), _), _) => 3 
}
}