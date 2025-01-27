package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: Int, c: T_A[Int, Byte]) extends T_A[Byte, T_A[T_A[Byte, T_B], Int]]
case class CC_B[C](a: C) extends T_A[C, T_A[CC_A, T_B]]
case class CC_C(a: T_A[CC_A, T_A[CC_A, T_B]], b: CC_B[T_B], c: Byte) extends T_A[CC_B[T_A[T_B, T_B]], T_A[CC_A, T_B]]
case class CC_D(a: Byte, b: (Char,CC_B[CC_C])) extends T_B
case class CC_E(a: CC_B[CC_A]) extends T_B
case class CC_F(a: T_B, b: CC_B[CC_C], c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(0, (_,CC_B(_))) => 0 
  case CC_D(_, (_,CC_B(_))) => 1 
  case CC_E(CC_B(CC_A(_, _, _))) => 2 
  case CC_F(_, _, _) => 3 
}
}