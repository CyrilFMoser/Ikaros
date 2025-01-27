package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_A, b: T_A, c: T_B[T_A, CC_B]) extends T_A
case class CC_D[C](a: Int, b: C, c: C) extends T_B[C, Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C(_, _, _) => 2 
}
}