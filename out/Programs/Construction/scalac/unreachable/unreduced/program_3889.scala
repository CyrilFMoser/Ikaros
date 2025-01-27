package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean, b: T_B[T_B[T_A, (Boolean,Char)], T_A]) extends T_A
case class CC_B(a: Char, b: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: (CC_B,CC_A), b: T_A, c: Byte) extends T_B[Byte, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)