package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[D, D], b: (Int,CC_A[Int])) extends T_A[T_A[D, D], D]
case class CC_C[E](a: E, b: T_A[Int, E]) extends T_A[Int, E]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_B(_, (_,_))) => 2 
}
}