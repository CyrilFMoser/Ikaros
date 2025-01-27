package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Boolean, C], b: T_A[C, C]) extends T_A[Boolean, C]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: Boolean) extends T_A[Boolean, D]
case class CC_C[E, F](a: T_A[F, E], b: T_A[Boolean, F]) extends T_A[Boolean, E]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _, _), _) => 1 
  case CC_A(CC_C(_, _), _) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(_, _) => 4 
}
}