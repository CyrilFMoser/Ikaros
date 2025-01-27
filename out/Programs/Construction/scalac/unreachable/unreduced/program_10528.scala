package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: Boolean, b: Int, c: T_A[E]) extends T_A[E]
case class CC_D(a: T_B[(Int,Int)], b: Boolean) extends T_B[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_A(CC_D(_, _), CC_D(_, _), CC_A(_, _, _))) => 1 
  case CC_C(_, _, CC_A(CC_D(_, _), CC_D(_, _), CC_B())) => 2 
  case CC_C(_, _, CC_A(CC_D(_, _), CC_D(_, _), CC_C(_, _, _))) => 3 
  case CC_C(_, _, CC_B()) => 4 
  case CC_C(_, _, CC_C(_, _, _)) => 5 
}
}
// This is not matched: CC_A(_, _, _)