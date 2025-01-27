package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: T_B[T_B[Char, T_A], T_B[Int, T_A]], c: T_A) extends T_A
case class CC_B[C](a: T_B[C, C]) extends T_B[C, T_B[C, C]]
case class CC_C[D, E](a: T_A) extends T_B[D, T_B[D, D]]
case class CC_D() extends T_B[Byte, T_B[Byte, Byte]]

val v_a: T_B[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(_)