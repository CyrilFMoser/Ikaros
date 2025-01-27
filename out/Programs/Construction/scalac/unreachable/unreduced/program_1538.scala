package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Boolean], T_B[T_A, T_A]], b: T_B[T_A, T_A]) extends T_A
case class CC_B(a: T_B[Byte, T_B[Int, T_A]], b: (T_A,Byte), c: T_B[T_B[T_A, Int], T_B[Char, CC_A]]) extends T_A
case class CC_C[C]() extends T_B[T_A, C]
case class CC_D[D](a: CC_A) extends T_B[T_A, D]
case class CC_E[E](a: E, b: T_B[E, E]) extends T_B[T_A, E]

val v_a: T_B[T_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_) => 1 
  case CC_E(_, _) => 2 
}
}