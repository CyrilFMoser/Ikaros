package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, T_B]
case class CC_B(a: T_A[T_B, T_B], b: (T_B,T_A[T_B, T_B])) extends T_A[T_B, T_B]
case class CC_C(a: T_A[CC_A, T_B], b: Char, c: CC_B) extends T_A[T_B, T_B]
case class CC_D(a: T_A[T_B, T_B]) extends T_B
case class CC_E(a: Char) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}