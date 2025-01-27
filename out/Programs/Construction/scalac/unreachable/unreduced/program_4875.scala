package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, T_B[Char, T_A]]) extends T_A
case class CC_B(a: CC_A, b: Byte, c: Byte) extends T_A
case class CC_C(a: (CC_B,Byte), b: Int, c: Char) extends T_A
case class CC_D[C]() extends T_B[T_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)