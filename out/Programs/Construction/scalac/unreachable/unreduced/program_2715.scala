package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],T_B), b: T_A[T_A[T_B]], c: (T_B,(T_B,T_B))) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: Char, b: T_A[Char]) extends T_B
case class CC_C(a: Boolean, b: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)