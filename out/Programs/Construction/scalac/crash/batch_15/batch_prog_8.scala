package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[T_B, C], c: (T_A[T_B, T_B],(T_B,T_B))) extends T_A[T_B, C]
case class CC_B() extends T_A[T_B, T_A[T_B, T_A[T_B, T_B]]]
case class CC_C() extends T_A[T_B, T_A[T_B, T_A[T_B, T_B]]]
case class CC_D() extends T_B
case class CC_E(a: CC_A[Char]) extends T_B

val v_a: T_A[T_B, T_A[T_B, T_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_C(), _) => 1 
  case CC_B() => 2 
  case CC_C() => 3 
}
}
// This is not matched: CC_A(_, CC_B(), _)