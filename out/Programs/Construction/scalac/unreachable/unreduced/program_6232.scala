package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: T_A, c: T_B[(Byte,T_A), T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_B[T_A, CC_A], b: T_A, c: CC_A) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C]() extends T_B[CC_C, C]
case class CC_E(a: CC_A) extends T_B[CC_C, Byte]
case class CC_F[D]() extends T_B[CC_C, D]

val v_a: T_B[CC_C, Byte] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_, CC_A(_, _, _), _)) => 1 
  case CC_E(CC_A(_, CC_C(_), _)) => 2 
  case CC_F() => 3 
}
}
// This is not matched: CC_E(CC_A(_, CC_B(_, _, _), _))