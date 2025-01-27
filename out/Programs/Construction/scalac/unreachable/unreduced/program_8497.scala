package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[Char, T_B]
case class CC_B() extends T_A[Char, T_B]
case class CC_C(a: T_A[T_A[Char, T_B], T_A[Char, T_B]]) extends T_A[Char, T_B]
case class CC_D(a: T_B, b: CC_C) extends T_B
case class CC_E(a: T_A[Char, T_B]) extends T_B
case class CC_F(a: CC_E, b: CC_C, c: CC_C) extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}