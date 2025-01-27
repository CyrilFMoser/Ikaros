package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: (T_B[Byte],T_A[Boolean, Char]), b: T_A[D, T_B[Int]], c: D) extends T_A[D, T_B[Int]]
case class CC_B[E](a: T_A[E, E], b: Byte) extends T_A[E, T_B[Int]]
case class CC_C[F](a: T_A[F, T_B[Int]], b: Boolean) extends T_B[F]
case class CC_D() extends T_B[CC_C[Char]]

val v_a: T_B[CC_C[Char]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), _) => 0 
  case CC_C(CC_B(_, _), _) => 1 
  case CC_D() => 2 
}
}