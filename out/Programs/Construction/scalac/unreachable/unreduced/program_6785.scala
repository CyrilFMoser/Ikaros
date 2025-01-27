package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: T_A, b: T_B[C, T_B[C, C]], c: CC_B) extends T_B[C, T_B[C, C]]
case class CC_D[D]() extends T_B[D, T_B[D, D]]
case class CC_E(a: T_B[Char, T_B[Char, Char]], b: T_B[CC_C[T_A], CC_C[CC_B]]) extends T_B[Char, T_B[Char, Char]]

val v_a: T_B[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B(CC_A(_))) => 0 
  case CC_C(_, _, CC_B(CC_B(_))) => 1 
  case CC_D() => 2 
  case CC_E(_, _) => 3 
}
}