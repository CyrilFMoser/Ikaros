package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C], c: C) extends T_A[C, Int]
case class CC_B(a: T_A[(Char,Byte), Int], b: T_A[T_A[T_B, T_B], Char], c: Char) extends T_A[Byte, Int]
case class CC_C(a: Char) extends T_A[Byte, Int]
case class CC_D() extends T_B
case class CC_E(a: T_B, b: CC_D) extends T_B
case class CC_F(a: T_A[CC_A[CC_E], Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_D(), CC_D()) => 0 
  case CC_E(CC_E(_, _), CC_D()) => 1 
  case CC_E(CC_F(_), CC_D()) => 2 
  case CC_F(_) => 3 
}
}
// This is not matched: CC_D()