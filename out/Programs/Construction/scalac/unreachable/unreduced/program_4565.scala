package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: C, c: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D]) extends T_A[T_A[D, D], D]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(_), _, _) => 1 
}
}