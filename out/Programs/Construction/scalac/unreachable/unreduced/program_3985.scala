package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Int, b: T_B[T_A[D, D]]) extends T_A[D, E]
case class CC_B() extends T_A[T_B[Char], (Int,T_A[Char, Int])]
case class CC_C(a: T_A[Int, Int]) extends T_A[T_B[Char], (Int,T_A[Char, Int])]
case class CC_D(a: T_B[CC_A[CC_B, CC_C]]) extends T_B[CC_A[CC_B, CC_C]]
case class CC_E() extends T_B[CC_A[CC_B, CC_C]]
case class CC_F[F](a: Boolean) extends T_B[CC_D]

val v_a: T_A[T_B[Char], (Int,T_A[Char, Int])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _)) => 1 
}
}
// This is not matched: CC_A(_, _)