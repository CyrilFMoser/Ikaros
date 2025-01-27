package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: CC_A[D]) extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[T_A[T_B, T_B], T_B], b: T_A[CC_B[T_B], Boolean], c: T_B) extends T_B

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_A(_), _, CC_C(_, _, _))) => 0 
  case CC_A(CC_C(CC_B(_, _), _, CC_C(_, _, _))) => 1 
  case CC_B(_, _) => 2 
}
}