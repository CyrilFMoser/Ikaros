package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D]) extends T_A[D]
case class CC_B() extends T_A[(T_A[Boolean],Byte)]
case class CC_C(a: T_A[Int]) extends T_A[(T_A[Boolean],Byte)]
case class CC_D[E](a: CC_A[E], b: CC_A[E]) extends T_B[E, T_B[Int, CC_A[(Byte,Boolean)]]]
case class CC_E[F](a: Char, b: CC_D[T_A[F]], c: CC_C) extends T_B[F, T_B[Int, CC_A[(Byte,Boolean)]]]
case class CC_F(a: T_B[CC_A[CC_C], T_B[CC_B, CC_B]], b: Int) extends T_B[(T_A[CC_C],T_A[CC_B]), T_B[Int, CC_A[(Byte,Boolean)]]]

val v_a: T_B[CC_F, T_B[Int, CC_A[(Byte,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(CC_A(_, _), _)) => 0 
  case CC_E(_, _, _) => 1 
}
}