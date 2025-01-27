package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], b: T_B[Boolean, Char], c: Boolean) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[Boolean, C]) extends T_B[Boolean, C]
case class CC_D[D](a: D, b: D, c: (T_B[Boolean, CC_B],Char)) extends T_B[D, T_B[Boolean, Int]]
case class CC_E[E](a: CC_B, b: T_B[E, T_B[Boolean, Int]]) extends T_B[Boolean, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_), _) => 0 
  case CC_A(_, CC_E(_, CC_D(_, _, _)), _) => 1 
  case CC_B() => 2 
}
}