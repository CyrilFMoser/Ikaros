package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_B[F, F]) extends T_A[T_B[T_B[Byte, Boolean], CC_A[Int]], F]
case class CC_C[G]() extends T_B[(CC_B[(Boolean,Boolean)],T_A[Char, Int]), G]
case class CC_D[H, I](a: I, b: H, c: T_A[H, T_B[H, H]]) extends T_B[H, I]

val v_a: T_B[(CC_B[(Boolean,Boolean)],T_A[Char, Int]), Boolean] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(true, (CC_B(_),_), CC_A(true)) => 1 
  case CC_D(true, (CC_B(_),_), CC_A(false)) => 2 
  case CC_D(false, (CC_B(_),_), CC_A(true)) => 3 
  case CC_D(false, (CC_B(_),_), CC_A(false)) => 4 
}
}