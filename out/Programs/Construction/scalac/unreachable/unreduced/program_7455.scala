package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: T_B, c: C) extends T_A[C, T_A[T_B, Char]]
case class CC_B[D](a: (CC_A[T_B],CC_A[T_B]), b: T_B, c: T_A[D, T_A[T_B, Char]]) extends T_A[D, T_A[T_B, Char]]
case class CC_C(a: T_A[T_B, CC_B[T_B]]) extends T_B
case class CC_D[E]() extends T_B
case class CC_E(a: CC_A[T_A[CC_C, T_B]], b: T_A[CC_A[CC_C], CC_D[CC_C]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
  case CC_E(CC_A(_, CC_C(_), _), _) => 2 
  case CC_E(CC_A(_, CC_E(_, _), _), _) => 3 
}
}
// This is not matched: CC_E(CC_A(_, CC_D(), _), _)