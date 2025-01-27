package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: E) extends T_A[E]
case class CC_C(a: T_A[T_A[Int]], b: T_A[T_A[Char]], c: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_D() extends T_B[CC_B[T_B[Char, CC_C]], T_A[Int]]
case class CC_E(a: T_A[CC_D], b: Char) extends T_B[CC_B[T_B[Char, CC_C]], T_A[Int]]

val v_a: T_B[CC_B[T_B[Char, CC_C]], T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(CC_A(_, _), _), 'x') => 1 
  case CC_E(CC_A(CC_B(_, _), _), 'x') => 2 
  case CC_E(CC_B(_, _), 'x') => 3 
  case CC_E(CC_A(CC_A(_, _), _), _) => 4 
  case CC_E(CC_A(CC_B(_, _), _), _) => 5 
}
}
// This is not matched: CC_E(CC_B(_, _), _)