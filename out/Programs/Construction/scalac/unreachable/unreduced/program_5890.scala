package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_B[Int, Char], c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C) extends T_B[T_B[(CC_B,Int), CC_A], C]
case class CC_E() extends T_B[T_B[(CC_B,Int), CC_A], T_B[T_B[Byte, Byte], T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()