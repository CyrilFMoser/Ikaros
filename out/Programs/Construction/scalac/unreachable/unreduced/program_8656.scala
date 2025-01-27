package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int, b: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_A[F], b: F) extends T_A[F]
case class CC_D(a: Char) extends T_B[T_A[CC_C[(Boolean,Char)]], T_A[T_A[Boolean]]]

val v_a: T_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _), CC_D(_)) => 2 
  case CC_C(CC_B(), CC_D(_)) => 3 
  case CC_C(CC_C(CC_A(_, _), CC_D(_)), CC_D(_)) => 4 
  case CC_C(CC_C(CC_B(), CC_D(_)), CC_D(_)) => 5 
  case CC_C(CC_C(CC_C(_, _), CC_D(_)), CC_D(_)) => 6 
}
}