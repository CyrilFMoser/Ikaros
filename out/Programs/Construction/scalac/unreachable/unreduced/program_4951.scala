package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D, c: D) extends T_A[D, T_A[Boolean, (Byte,Boolean)]]
case class CC_B[E](a: E, b: CC_A[E]) extends T_A[E, T_A[Boolean, (Byte,Boolean)]]
case class CC_C[F](a: CC_A[F], b: T_A[F, F], c: T_B[Byte]) extends T_A[F, T_A[Boolean, (Byte,Boolean)]]
case class CC_D[G](a: T_B[G], b: Char) extends T_B[G]
case class CC_E(a: CC_B[CC_A[Byte]], b: CC_A[T_B[Boolean]], c: CC_B[T_A[Boolean, Int]]) extends T_B[CC_C[T_B[Byte]]]

val v_a: T_A[Char, T_A[Boolean, (Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), _, 'x') => 0 
  case CC_A(CC_D(_, _), _, _) => 1 
  case CC_B('x', CC_A(CC_D(_, _), _, _)) => 2 
  case CC_B(_, CC_A(CC_D(_, _), _, _)) => 3 
  case CC_C(_, _, _) => 4 
}
}