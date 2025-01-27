package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: C, b: T_B) extends T_A[C, T_A[C, C]]
case class CC_B(a: Int) extends T_B
case class CC_C(a: T_B, b: T_A[CC_A[T_B, (Boolean,Char)], Int]) extends T_B

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_)) => 0 
  case CC_A(_, CC_C(_, _)) => 1 
}
}