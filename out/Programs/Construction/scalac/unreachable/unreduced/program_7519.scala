package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, Char]
case class CC_B(a: Boolean, b: T_A[T_B, Char], c: T_A[T_B, (T_B,CC_A)]) extends T_A[T_B, Char]
case class CC_C() extends T_B
case class CC_D(a: CC_C, b: T_A[T_B, Char], c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_C(), CC_A(), CC_C()) => 1 
  case CC_D(CC_C(), CC_B(true, _, _), CC_C()) => 2 
  case CC_D(CC_C(), CC_B(false, _, _), CC_C()) => 3 
}
}