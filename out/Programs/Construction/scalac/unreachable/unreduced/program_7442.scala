package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_A[T_B, T_B], T_A[T_B, T_B]]]
case class CC_B[D](a: Char) extends T_A[D, T_A[T_A[T_B, T_B], T_A[T_B, T_B]]]
case class CC_C(a: CC_B[T_A[Boolean, T_B]], b: T_B, c: T_A[T_B, CC_B[T_B]]) extends T_A[T_B, T_A[T_A[T_B, T_B], T_A[T_B, T_B]]]
case class CC_D(a: CC_A[CC_A[Byte]]) extends T_B
case class CC_E(a: T_B, b: T_A[T_A[CC_D, (Int,Char)], Byte], c: CC_A[(CC_C,CC_C)]) extends T_B
case class CC_F(a: T_A[T_B, (T_B,Boolean)], b: CC_A[CC_B[Int]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(_, CC_A()) => 2 
}
}