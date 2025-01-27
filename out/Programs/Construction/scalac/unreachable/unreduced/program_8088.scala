package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B) extends T_A[T_A[Boolean]]
case class CC_B(a: CC_A[T_A[T_B]], b: T_B) extends T_A[T_A[Boolean]]
case class CC_C(a: T_A[CC_A[Byte]], b: CC_B) extends T_A[T_A[Boolean]]
case class CC_D(a: CC_B, b: T_B) extends T_B
case class CC_E(a: (Byte,CC_B), b: Char, c: T_A[CC_A[CC_D]]) extends T_B
case class CC_F(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E((_,CC_B(_, _)), _, _) => 1 
  case CC_F(CC_D(CC_B(_, _), _)) => 2 
  case CC_F(CC_F(CC_D(_, _))) => 3 
  case CC_F(CC_F(CC_E(_, _, _))) => 4 
  case CC_F(CC_F(CC_F(_))) => 5 
}
}
// This is not matched: CC_F(CC_E(_, _, _))