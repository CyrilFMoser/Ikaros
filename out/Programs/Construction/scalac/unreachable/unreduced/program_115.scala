package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, (T_A[T_B, (Byte,Byte)],(T_B,T_B))]
case class CC_B(a: T_A[Int, CC_A], b: Boolean, c: Int) extends T_A[T_B, (T_A[T_B, (Byte,Byte)],(T_B,T_B))]
case class CC_C[C](a: T_A[C, C]) extends T_A[C, T_B]
case class CC_D(a: (CC_A,T_A[CC_A, CC_B]), b: CC_C[Char], c: T_B) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_), CC_E()) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_D(_, CC_C(_), CC_D(_, _, _))