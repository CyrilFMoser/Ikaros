package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int) extends T_A[T_B[T_B[Char, Char], (Boolean,Byte)]]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_B[T_B[Char, Char], (Boolean,Byte)]]
case class CC_C(a: Int, b: CC_B, c: T_B[Boolean, CC_A]) extends T_A[T_B[T_B[Char, Char], (Boolean,Byte)]]
case class CC_D[D, E](a: CC_A, b: Boolean, c: T_A[D]) extends T_B[D, E]
case class CC_E[F, G](a: T_B[G, G], b: Int) extends T_B[G, F]

val v_a: T_A[T_B[T_B[Char, Char], (Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
  case CC_C(12, CC_B(_, CC_A(_), _), CC_D(_, _, _)) => 2 
  case CC_C(12, CC_B(_, CC_A(_), _), CC_E(CC_D(_, _, _), _)) => 3 
  case CC_C(12, CC_B(_, CC_A(_), _), CC_E(CC_E(_, _), _)) => 4 
  case CC_C(_, CC_B(_, CC_A(_), _), CC_D(_, _, _)) => 5 
  case CC_C(_, CC_B(_, CC_A(_), _), CC_E(CC_D(_, _, _), _)) => 6 
  case CC_C(_, CC_B(_, CC_A(_), _), CC_E(CC_E(_, _), _)) => 7 
}
}