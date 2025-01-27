package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_B[D]) extends T_A[(T_B[Int],T_B[(Char,Char)]), D]
case class CC_B[E, F](a: T_B[E]) extends T_B[E]
case class CC_C[G](a: CC_A[T_B[G]], b: CC_A[G], c: CC_A[G]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_B(CC_C(_, _, _)) => 1 
  case CC_C(_, CC_A(_, _, _), _) => 2 
}
}