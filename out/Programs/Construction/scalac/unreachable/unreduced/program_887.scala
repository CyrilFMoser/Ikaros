package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, T_A[T_B, T_A[Boolean, T_B]]]
case class CC_B(a: T_B, b: Boolean, c: Char) extends T_A[T_B, T_A[T_B, T_A[Boolean, T_B]]]
case class CC_C() extends T_B
case class CC_D(a: CC_B, b: CC_A, c: T_A[T_A[T_B, Int], T_A[Char, CC_B]]) extends T_B
case class CC_E(a: T_B, b: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(_, _, _), CC_A(), _) => 1 
  case CC_E(_, _) => 2 
}
}