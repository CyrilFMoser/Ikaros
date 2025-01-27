package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_B[T_B[Byte, Int], Boolean]]
case class CC_B(a: T_A[T_B[Boolean, Byte]], b: CC_A[(Char,(Int,Char))]) extends T_A[T_B[T_B[Byte, Int], Boolean]]
case class CC_C[E](a: E) extends T_B[E, (CC_B,Char)]

val v_a: T_A[T_B[T_B[Byte, Int], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}