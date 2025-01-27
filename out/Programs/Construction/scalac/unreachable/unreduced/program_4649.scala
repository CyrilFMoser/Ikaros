package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: D) extends T_A[T_A[D, D], D]
case class CC_C[E](a: CC_A[E], b: T_A[T_A[E, E], E], c: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_D(a: T_A[Int, T_B], b: CC_C[CC_A[Int]], c: CC_A[Byte]) extends T_B
case class CC_E(a: CC_A[CC_C[T_B]], b: T_A[Int, CC_A[T_B]]) extends T_B
case class CC_F(a: Boolean, b: CC_C[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A(CC_D(_, _, _))) => 0 
  case CC_D(_, _, CC_A(CC_E(_, _))) => 1 
  case CC_D(_, _, CC_A(CC_F(_, _))) => 2 
  case CC_E(_, _) => 3 
  case CC_F(_, _) => 4 
}
}