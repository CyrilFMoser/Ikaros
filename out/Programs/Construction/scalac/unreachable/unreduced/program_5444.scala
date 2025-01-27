package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[((Char,Byte),T_A), Byte]) extends T_A
case class CC_B(a: Char, b: (T_A,CC_A)) extends T_B[Byte, T_B[CC_A, Char]]
case class CC_C(a: T_A, b: T_A, c: ((T_A,T_A),Boolean)) extends T_B[Byte, T_B[CC_A, Char]]
case class CC_D() extends T_B[Byte, T_B[CC_A, Char]]

val v_a: T_B[Byte, T_B[CC_A, Char]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(_, _)