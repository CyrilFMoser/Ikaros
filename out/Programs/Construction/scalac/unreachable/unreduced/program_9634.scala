package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D, E](a: E, b: Boolean) extends T_A[D, T_A[T_A[D, D], D]]
case class CC_C[F](a: CC_B[F, F], b: (CC_B[Byte, (Int,Int)],T_A[Boolean, Int])) extends T_A[F, T_A[T_A[F, F], F]]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_B(true, _), (CC_B(_, _),_)) => 2 
  case CC_C(CC_B(false, _), (CC_B(_, _),_)) => 3 
}
}