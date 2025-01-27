package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: D) extends T_A[D]
case class CC_B() extends T_A[T_A[CC_A[Boolean]]]
case class CC_C[E]() extends T_A[E]
case class CC_D[F](a: T_B[T_A[F], F]) extends T_B[T_B[T_A[CC_B], T_A[CC_B]], F]
case class CC_E(a: Byte) extends T_B[T_B[T_A[CC_B], T_A[CC_B]], CC_C[T_B[CC_B, (Byte,Boolean)]]]
case class CC_F(a: CC_E, b: CC_B) extends T_B[T_B[T_A[CC_B], T_A[CC_B]], CC_C[T_B[CC_B, (Byte,Boolean)]]]

val v_a: T_A[T_B[T_B[T_A[CC_B], T_A[CC_B]], CC_C[T_B[CC_B, (Byte,Boolean)]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), CC_D(_)) => 0 
  case CC_A(CC_E(_), CC_D(_)) => 1 
  case CC_A(CC_F(_, _), CC_D(_)) => 2 
  case CC_A(CC_D(_), CC_E(_)) => 3 
  case CC_A(CC_E(_), CC_E(_)) => 4 
  case CC_A(CC_F(_, _), CC_E(_)) => 5 
  case CC_A(CC_D(_), CC_F(_, _)) => 6 
  case CC_A(CC_E(_), CC_F(_, _)) => 7 
  case CC_A(CC_F(_, _), CC_F(_, _)) => 8 
  case CC_C() => 9 
}
}