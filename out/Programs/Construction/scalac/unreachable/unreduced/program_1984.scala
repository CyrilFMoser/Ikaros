package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, Byte]
case class CC_B(a: Char, b: T_A[Byte, Byte], c: T_A[T_A[Byte, Int], Byte]) extends T_A[Char, Byte]
case class CC_C(a: T_A[CC_B, T_A[CC_B, CC_B]], b: Int) extends T_A[Char, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 1 
  case CC_C(_, _) => 2 
}
}