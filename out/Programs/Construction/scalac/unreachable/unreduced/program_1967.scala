package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[(Char,Byte), T_A]], b: T_A) extends T_A
case class CC_B(a: T_A, b: Boolean, c: T_B[T_A, Boolean]) extends T_A
case class CC_C[C]() extends T_B[C, CC_B]
case class CC_D[D](a: T_A, b: Byte) extends T_B[D, CC_B]

val v_a: T_B[T_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(_, CC_B(_, _, _)), _) => 1 
  case CC_D(CC_B(_, _, _), _) => 2 
}
}
// This is not matched: CC_D(CC_A(_, CC_A(_, _)), _)