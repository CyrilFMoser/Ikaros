package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Boolean,Int), T_A], T_B[T_A, T_A]], b: Boolean, c: (Int,T_B[T_A, Int])) extends T_A
case class CC_B(a: T_A, b: Int) extends T_A
case class CC_C(a: Char, b: T_A, c: Int) extends T_A
case class CC_D(a: Boolean) extends T_B[CC_A, T_A]
case class CC_E(a: CC_B, b: T_B[CC_A, T_A], c: T_B[CC_B, CC_A]) extends T_B[CC_A, T_A]
case class CC_F(a: CC_C, b: Int) extends T_B[CC_A, T_A]

val v_a: T_B[CC_A, T_A] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: CC_F(CC_C(_, _, _), _)