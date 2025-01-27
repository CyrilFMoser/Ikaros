package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C]) extends T_A[C, T_A[(T_B,T_B), Boolean]]
case class CC_B(a: CC_A[CC_A[(Int,Char)]], b: T_B) extends T_B
case class CC_C(a: T_B, b: T_A[T_A[Char, (Boolean,Byte)], CC_A[T_B]], c: T_A[CC_A[T_B], Char]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_B(_, _)) => 0 
  case CC_B(CC_A(_, _), CC_C(_, _, _)) => 1 
  case CC_B(CC_A(_, _), CC_D()) => 2 
  case CC_C(_, _, _) => 3 
  case CC_D() => 4 
}
}