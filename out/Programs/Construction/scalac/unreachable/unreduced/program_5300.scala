package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B), T_A[T_B, T_B]], b: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_B(a: Char, b: CC_A, c: T_B) extends T_A[T_B, T_B]
case class CC_C(a: CC_A) extends T_A[T_B, T_B]
case class CC_D(a: CC_A, b: T_A[T_B, T_B], c: (T_A[T_B, T_B],CC_B)) extends T_B
case class CC_E(a: T_A[T_A[T_B, T_B], T_A[(Int,Boolean), CC_C]]) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), CC_A(_, _), _) => 0 
  case CC_D(CC_A(_, _), CC_B(_, CC_A(_, _), CC_D(_, _, _)), _) => 1 
  case CC_D(CC_A(_, _), CC_B(_, CC_A(_, _), CC_F()), _) => 2 
  case CC_D(CC_A(_, _), CC_C(CC_A(_, _)), _) => 3 
  case CC_E(_) => 4 
  case CC_F() => 5 
}
}
// This is not matched: CC_D(CC_A(_, _), CC_B(_, CC_A(_, _), CC_E(_)), _)