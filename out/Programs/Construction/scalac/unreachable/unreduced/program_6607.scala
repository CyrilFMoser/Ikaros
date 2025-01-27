package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Boolean], b: (Byte,T_B[Int, Byte]), c: T_A[T_B[Boolean, Char]]) extends T_A[T_A[T_B[Boolean, Byte]]]
case class CC_B() extends T_A[T_A[T_B[Boolean, Byte]]]
case class CC_C[D](a: T_A[D]) extends T_B[T_B[T_A[CC_B], Boolean], D]
case class CC_D[E](a: CC_A) extends T_B[T_B[T_A[CC_B], Boolean], E]
case class CC_E[F](a: Byte, b: CC_D[F]) extends T_B[T_B[T_A[CC_B], Boolean], F]

val v_a: T_B[T_B[T_A[CC_B], Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_A(_, (_,_), _)) => 1 
  case CC_E(_, _) => 2 
}
}