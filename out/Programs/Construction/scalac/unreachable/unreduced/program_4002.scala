package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,Char), Int], b: T_A) extends T_A
case class CC_B[C](a: T_A, b: T_B[T_B[C, C], C]) extends T_B[T_B[C, T_B[C, C]], C]
case class CC_C[D](a: CC_A, b: T_A, c: CC_A) extends T_B[T_B[D, T_B[D, D]], D]
case class CC_D[E]() extends T_B[T_B[E, T_B[E, E]], E]

val v_a: T_B[T_B[T_A, T_B[T_A, T_A]], T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _)), _) => 0 
  case CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 1 
  case CC_D() => 2 
}
}