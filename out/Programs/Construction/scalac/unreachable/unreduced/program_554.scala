package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Boolean, Boolean], T_A[Byte]]]
case class CC_B[D](a: T_B[D, D], b: CC_A) extends T_B[D, CC_A]
case class CC_C[E](a: Boolean) extends T_B[E, CC_A]
case class CC_D[F](a: Boolean, b: F) extends T_B[T_B[F, CC_A], F]

val v_a: T_B[Byte, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
  case CC_C(_) => 1 
}
}