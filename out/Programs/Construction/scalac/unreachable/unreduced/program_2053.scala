package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[Boolean, Char], T_B], b: Byte, c: T_B) extends T_A[T_B, (T_A[T_B, T_B],T_A[T_B, Int])]
case class CC_B(a: Byte, b: Int) extends T_B
case class CC_C(a: CC_B, b: T_A[T_A[Byte, T_B], T_A[CC_A, T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _) => 1 
}
}