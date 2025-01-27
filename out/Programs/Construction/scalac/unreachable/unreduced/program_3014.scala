package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[(Int,Boolean), (Int,Byte)], T_B[Char, Byte]]]
case class CC_B[D](a: D, b: CC_A, c: D) extends T_A[T_B[T_B[(Int,Boolean), (Int,Byte)], T_B[Char, Byte]]]
case class CC_C() extends T_A[T_B[T_B[(Int,Boolean), (Int,Byte)], T_B[Char, Byte]]]
case class CC_D[E](a: T_A[E]) extends T_B[E, T_A[E]]
case class CC_E[F](a: F, b: T_B[F, T_A[F]], c: T_B[F, F]) extends T_B[F, T_A[F]]
case class CC_F[G](a: CC_A) extends T_B[G, T_A[G]]

val v_a: T_B[Boolean, T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, CC_D(_), _) => 1 
  case CC_E(_, CC_E(true, _, _), _) => 2 
  case CC_E(_, CC_E(false, _, _), _) => 3 
  case CC_E(_, CC_F(_), _) => 4 
  case CC_F(CC_A()) => 5 
}
}