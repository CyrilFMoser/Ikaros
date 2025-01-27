package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: Int, b: T_A[C, C], c: T_A[C, C]) extends T_A[C, D]
case class CC_B[F, E](a: T_B) extends T_A[E, F]
case class CC_C[G, H](a: CC_B[H, ((Boolean,Boolean),(Byte,Byte))], b: CC_A[H, G]) extends T_A[G, H]
case class CC_D() extends T_B
case class CC_E(a: Char, b: T_A[Byte, T_A[T_B, T_B]], c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 1 
  case CC_E(_, CC_A(_, CC_A(_, _, _), CC_B(_)), _) => 2 
  case CC_E(_, CC_A(_, CC_A(_, _, _), CC_C(_, _)), _) => 3 
  case CC_E(_, CC_A(_, CC_B(_), CC_A(_, _, _)), _) => 4 
  case CC_E(_, CC_A(_, CC_B(_), CC_B(_)), _) => 5 
  case CC_E(_, CC_A(_, CC_B(_), CC_C(_, _)), _) => 6 
  case CC_E(_, CC_A(_, CC_C(_, _), CC_A(_, _, _)), _) => 7 
  case CC_E(_, CC_A(_, CC_C(_, _), CC_B(_)), _) => 8 
  case CC_E(_, CC_A(_, CC_C(_, _), CC_C(_, _)), _) => 9 
  case CC_E(_, CC_B(CC_E(_, _, _)), _) => 10 
  case CC_E(_, CC_C(CC_B(_), CC_A(_, _, _)), _) => 11 
}
}
// This is not matched: CC_E(_, CC_B(CC_D()), _)