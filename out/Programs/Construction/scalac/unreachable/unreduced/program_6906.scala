package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[((Char,Char),Byte), T_A]) extends T_A
case class CC_B(a: Byte, b: T_B[Boolean, T_A], c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_B[C, C], b: C) extends T_B[C, T_B[T_A, T_B[CC_C, CC_A]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _, _)