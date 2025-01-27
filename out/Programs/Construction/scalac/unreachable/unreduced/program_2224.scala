package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A, T_A], b: Boolean) extends T_A
case class CC_C(a: CC_A, b: CC_A) extends T_A
case class CC_D[C](a: CC_C, b: Char, c: CC_A) extends T_B[CC_C, C]
case class CC_E[D]() extends T_B[D, CC_A]
case class CC_F[E](a: CC_D[E], b: Int) extends T_B[E, CC_A]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _), _, CC_A(CC_A(_))) => 0 
  case CC_D(CC_C(_, _), _, CC_A(CC_B(_, _))) => 1 
  case CC_D(CC_C(_, _), _, CC_A(CC_C(_, _))) => 2 
}
}