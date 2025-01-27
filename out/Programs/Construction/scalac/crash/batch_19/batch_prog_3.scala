package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, T_A],T_B[T_A, T_A])) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C(a: Char) extends T_A
case class CC_D[C, D](a: D, b: T_B[C, CC_C]) extends T_B[C, D]
case class CC_E[E]() extends T_B[Boolean, E]
case class CC_F[F]() extends T_B[Boolean, F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _),CC_D(_, _))) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}