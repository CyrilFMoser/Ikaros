package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, Char]
case class CC_B[D](a: T_A[D, Char]) extends T_A[D, Char]
case class CC_C[E](a: (CC_A[Char],CC_B[T_B]), b: CC_B[E], c: Boolean) extends T_A[CC_A[CC_A[E]], E]
case class CC_D(a: T_A[T_A[T_B, T_B], Char], b: CC_B[T_A[T_B, T_B]], c: CC_B[T_A[T_B, Char]]) extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), CC_B(CC_A(_)), CC_B(CC_A(_))) => 0 
  case CC_D(CC_B(_), CC_B(CC_A(_)), CC_B(CC_A(_))) => 1 
  case CC_D(CC_A(_), CC_B(CC_B(_)), CC_B(CC_A(_))) => 2 
  case CC_D(CC_B(_), CC_B(CC_B(_)), CC_B(CC_A(_))) => 3 
  case CC_D(CC_A(_), CC_B(CC_A(_)), CC_B(CC_B(_))) => 4 
  case CC_D(CC_B(_), CC_B(CC_A(_)), CC_B(CC_B(_))) => 5 
  case CC_D(CC_A(_), CC_B(CC_B(_)), CC_B(CC_B(_))) => 6 
  case CC_D(CC_B(_), CC_B(CC_B(_)), CC_B(CC_B(_))) => 7 
}
}