package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[(Char,Int)],T_B[T_A]), b: Byte, c: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A
case class CC_C(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_D(a: T_A, b: T_B[(Char,CC_C)]) extends T_B[(Char,CC_C)]
case class CC_E(a: CC_C) extends T_B[(Char,CC_C)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_A(_, _, _), _, _) => 1 
  case CC_C(CC_B(_, _, _), _, _) => 2 
  case CC_C(CC_C(_, _, _), _, _) => 3 
}
}
// This is not matched: CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _))