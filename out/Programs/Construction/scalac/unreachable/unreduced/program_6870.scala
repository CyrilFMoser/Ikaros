package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Byte, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: T_B[T_B[T_A, CC_A], CC_A]) extends T_A
case class CC_C[C](a: T_B[C, C], b: CC_A, c: CC_A) extends T_B[T_A, C]
case class CC_D[D](a: T_B[T_A, T_B[T_A, CC_A]], b: CC_A, c: T_B[T_A, D]) extends T_B[T_A, D]
case class CC_E[F]() extends T_B[T_A, F]

val v_a: T_B[T_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_C(_, _, _), CC_A(_), _) => 1 
  case CC_D(CC_D(CC_C(_, _, _), _, _), CC_A(_), _) => 2 
  case CC_D(CC_D(CC_D(_, _, _), _, _), CC_A(_), _) => 3 
  case CC_D(CC_D(CC_E(), _, _), CC_A(_), _) => 4 
  case CC_D(CC_E(), CC_A(_), _) => 5 
  case CC_E() => 6 
}
}