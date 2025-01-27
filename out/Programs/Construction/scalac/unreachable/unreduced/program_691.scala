package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B, T_A[T_B, T_B]], T_B]
case class CC_B(a: Byte, b: CC_A) extends T_A[T_A[T_B, T_A[T_B, T_B]], T_B]
case class CC_C(a: T_A[CC_A, T_A[(Int,Byte), CC_B]]) extends T_A[T_A[T_B, T_A[T_B, T_B]], T_B]
case class CC_D(a: (Byte,T_B), b: CC_A, c: T_B) extends T_B
case class CC_E(a: Char, b: T_A[(CC_B,CC_B), Int], c: CC_A) extends T_B
case class CC_F(a: CC_B, b: CC_C, c: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, _, CC_A(_)) => 1 
}
}
// This is not matched: CC_F(CC_B(_, _), CC_C(_), CC_D(_, _, _))