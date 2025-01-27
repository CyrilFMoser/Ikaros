package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B], c: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_B) extends T_A[Byte]
case class CC_C(a: T_A[T_B]) extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E(a: CC_B, b: CC_C, c: T_A[T_A[(Char,Char)]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_B(CC_D()), CC_C(CC_A(_, _, _)), _) => 1 
  case CC_E(CC_B(CC_E(_, _, _)), CC_C(CC_A(_, _, _)), _) => 2 
  case CC_E(CC_B(CC_E(_, _, _)), CC_C(CC_C(_)), _) => 3 
}
}
// This is not matched: CC_E(CC_B(CC_D()), CC_C(CC_C(_)), _)