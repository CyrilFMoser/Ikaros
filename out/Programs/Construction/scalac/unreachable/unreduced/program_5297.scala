package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, D], b: Int, c: T_B[D]) extends T_A[(T_B[(Char,Byte)],T_A[Byte, Char]), D]
case class CC_B(a: Char) extends T_A[(T_B[(Char,Byte)],T_A[Byte, Char]), T_A[CC_A[Char, Boolean], T_B[Boolean]]]
case class CC_C(a: T_A[Char, T_A[CC_B, CC_B]], b: T_B[CC_A[(Char,Boolean), CC_B]], c: T_B[CC_B]) extends T_A[(T_B[(Char,Byte)],T_A[Byte, Char]), T_A[CC_A[Char, Boolean], T_B[Boolean]]]
case class CC_D[F](a: F) extends T_B[F]
case class CC_E(a: CC_A[CC_D[CC_C], T_A[CC_C, CC_B]], b: CC_C) extends T_B[CC_D[Char]]

val v_a: T_B[CC_D[Char]] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_)) => 0 
  case CC_E(CC_A(_, _, CC_D(_)), CC_C(_, CC_D(_), _)) => 1 
}
}