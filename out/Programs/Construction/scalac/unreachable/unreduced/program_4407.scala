package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[(Byte,Int), C], C]) extends T_A[T_A[T_A[T_B, T_B], Int], C]
case class CC_B(a: T_A[Byte, CC_A[T_B]], b: T_A[Byte, (T_B,Boolean)]) extends T_A[T_A[T_A[T_B, T_B], Int], CC_A[Int]]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: Byte, b: T_A[T_A[CC_B, (Boolean,Byte)], (T_B,CC_B)], c: T_B) extends T_B
case class CC_E(a: Int, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _, _) => 1 
}
}
// This is not matched: CC_E(_, _)