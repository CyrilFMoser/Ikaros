package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[C, Char]
case class CC_B(a: Byte, b: T_B) extends T_B
case class CC_C(a: (T_B,T_A[Char, T_B]), b: T_A[T_B, T_B], c: T_A[(CC_B,T_B), CC_B]) extends T_B
case class CC_D(a: CC_B, b: CC_B, c: T_A[(Boolean,CC_C), T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
  case CC_B(_, CC_C(_, _, _)) => 1 
  case CC_B(_, CC_D(_, _, _)) => 2 
  case CC_C(_, _, _) => 3 
  case CC_D(CC_B(_, _), CC_B(_, _), _) => 4 
}
}