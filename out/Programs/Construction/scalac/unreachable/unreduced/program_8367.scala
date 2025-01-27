package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A, ((Boolean,Int),CC_A)], b: T_A) extends T_A
case class CC_C(a: Int, b: Byte, c: Char) extends T_A
case class CC_D[C](a: CC_B, b: CC_B, c: T_B[CC_B, C]) extends T_B[CC_A, C]
case class CC_E[D](a: T_B[CC_A, D]) extends T_B[CC_A, D]
case class CC_F[E](a: Byte) extends T_B[CC_A, E]

val v_a: T_B[CC_A, Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, CC_B(_, _)), CC_B(_, _), _) => 0 
  case CC_D(CC_B(_, CC_C(_, _, _)), CC_B(_, _), _) => 1 
  case CC_E(CC_D(CC_B(_, _), CC_B(_, _), _)) => 2 
  case CC_E(CC_E(CC_D(_, _, _))) => 3 
  case CC_E(CC_E(CC_E(_))) => 4 
  case CC_E(CC_E(CC_F(_))) => 5 
  case CC_E(CC_F(_)) => 6 
  case CC_F(_) => 7 
}
}
// This is not matched: CC_D(CC_B(_, CC_A(_)), CC_B(_, _), _)