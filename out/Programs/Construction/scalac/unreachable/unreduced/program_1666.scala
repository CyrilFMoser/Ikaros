package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], Boolean]) extends T_A[T_B[Boolean, (Char,(Int,Byte))]]
case class CC_B(a: CC_A, b: T_B[CC_A, T_A[Byte]], c: Int) extends T_A[T_B[Boolean, (Char,(Int,Byte))]]
case class CC_C[E, D](a: E, b: CC_A, c: Byte) extends T_B[D, E]
case class CC_D[F, G](a: T_A[G]) extends T_B[F, G]

val v_a: T_A[T_B[Boolean, (Char,(Int,Byte))]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _)) => 0 
  case CC_A(CC_D(_)) => 1 
  case CC_B(_, CC_C(_, _, _), _) => 2 
  case CC_B(_, CC_D(_), _) => 3 
}
}