package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[C, Int], C]
case class CC_B(a: T_A[CC_A[(Boolean,Byte)], T_B]) extends T_A[T_A[CC_A[CC_A[(Int,Char)]], Int], CC_A[CC_A[(Int,Char)]]]
case class CC_C[D](a: CC_A[D], b: D) extends T_A[T_A[D, Int], D]
case class CC_D(a: CC_A[Byte], b: T_B) extends T_B
case class CC_E(a: CC_A[Boolean], b: Byte, c: CC_B) extends T_B
case class CC_F(a: CC_D, b: T_A[T_A[CC_B, Int], CC_B], c: T_A[T_A[(CC_E,CC_D), Int], (CC_E,CC_D)]) extends T_B

val v_a: T_A[T_A[CC_A[CC_A[(Int,Char)]], Int], CC_A[CC_A[(Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(CC_A(), CC_A())