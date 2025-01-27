package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: (T_B,T_B)) extends T_A[T_A[Char]]
case class CC_B(a: Char, b: CC_A, c: T_A[T_A[Char]]) extends T_B
case class CC_C(a: CC_B, b: (T_B,T_B), c: T_A[T_B]) extends T_B
case class CC_D(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_A(_, _)) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _), _)