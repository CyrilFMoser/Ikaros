package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: Int) extends T_A[C, T_A[T_B, T_A[T_B, T_B]]]
case class CC_B[D](a: Int, b: D, c: CC_A[D]) extends T_A[D, T_A[T_B, T_A[T_B, T_B]]]
case class CC_C(a: T_A[Boolean, CC_B[Byte]], b: T_A[CC_B[T_B], CC_A[Byte]]) extends T_A[(Char,Boolean), T_A[T_B, T_A[T_B, T_B]]]
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_A[CC_D], b: Int) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _)) => 0 
  case CC_E(CC_A(_, _), 12) => 1 
  case CC_E(CC_A(_, _), _) => 2 
  case CC_F() => 3 
}
}