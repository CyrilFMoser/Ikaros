package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Int, C], b: (T_B,(T_B,T_B)), c: T_A[C, C]) extends T_A[T_A[T_B, (T_B,Char)], C]
case class CC_B[D](a: D, b: Byte, c: T_B) extends T_A[T_A[T_B, (T_B,Char)], D]
case class CC_C(a: CC_B[(T_B,Boolean)], b: T_B) extends T_A[T_A[T_B, (T_B,Char)], T_B]
case class CC_D(a: T_A[CC_B[T_B], CC_A[CC_C]]) extends T_B
case class CC_E(a: T_A[CC_D, CC_B[T_B]], b: T_A[T_B, T_B], c: CC_D) extends T_B
case class CC_F(a: CC_B[CC_E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(CC_B(_, _, _)) => 2 
}
}