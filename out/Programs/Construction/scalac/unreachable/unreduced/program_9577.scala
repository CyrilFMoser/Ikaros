package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, (T_A,T_A)], b: T_A) extends T_A
case class CC_B[C]() extends T_B[C, T_A]
case class CC_C[D]() extends T_B[D, T_A]
case class CC_D[E](a: T_B[Char, E]) extends T_B[E, T_A]

val v_a: T_B[Byte, T_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C()