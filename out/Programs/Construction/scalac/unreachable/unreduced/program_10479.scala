package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, (Int,T_A)], b: T_A) extends T_A
case class CC_C(a: CC_A, b: Byte, c: (CC_A,CC_B)) extends T_A
case class CC_D[C](a: C, b: C, c: CC_C) extends T_B[C, T_A]
case class CC_E[D](a: CC_D[D]) extends T_B[D, T_A]
case class CC_F[E](a: T_B[E, E]) extends T_B[E, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}