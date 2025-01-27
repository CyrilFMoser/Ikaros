package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D], b: CC_A[D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[T_B, T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}