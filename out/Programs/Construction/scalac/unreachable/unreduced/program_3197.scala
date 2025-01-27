package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean) extends T_A[D]
case class CC_B[E](a: T_A[E], b: Boolean) extends T_B[E, T_B[E, E]]
case class CC_C[F](a: (T_A[Char],CC_A[Boolean]), b: T_B[F, F]) extends T_B[F, T_B[F, F]]
case class CC_D() extends T_B[(T_A[Int],(Char,Boolean)), T_B[(T_A[Int],(Char,Boolean)), (T_A[Int],(Char,Boolean))]]

val v_a: T_B[CC_D, T_B[CC_D, CC_D]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(true), _) => 0 
  case CC_B(CC_A(false), _) => 1 
  case CC_C(_, _) => 2 
}
}