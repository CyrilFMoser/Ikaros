package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_B[Byte, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[T_B[C, C], C]
case class CC_D[D](a: T_B[D, D], b: T_B[T_B[D, D], D]) extends T_B[T_B[D, D], D]
case class CC_E(a: Int) extends T_B[T_B[T_B[T_B[CC_B, CC_B], CC_B], T_B[T_B[CC_B, CC_B], CC_B]], T_B[T_B[CC_B, CC_B], CC_B]]

val v_a: T_B[T_B[T_B[T_B[CC_B, CC_B], CC_B], T_B[T_B[CC_B, CC_B], CC_B]], T_B[T_B[CC_B, CC_B], CC_B]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_C()) => 1 
  case CC_D(_, CC_D(_, CC_C())) => 2 
  case CC_D(_, CC_D(_, CC_D(_, _))) => 3 
  case CC_D(_, CC_E(_)) => 4 
  case CC_E(_) => 5 
}
}
// This is not matched: CC_D(_, CC_D(_, CC_E(_)))