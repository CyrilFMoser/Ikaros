package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: (T_A[T_B, T_B],T_B)) extends T_A[C, (T_A[T_B, T_B],Char)]
case class CC_B[D]() extends T_A[Char, D]
case class CC_C[E, F](a: CC_A[F]) extends T_A[E, (T_A[T_B, T_B],Char)]
case class CC_D() extends T_B
case class CC_E(a: T_B, b: Int) extends T_B

val v_a: T_A[Int, (T_A[T_B, T_B],Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_D())) => 0 
  case CC_A(_, (_,CC_E(_, _))) => 1 
  case CC_C(_) => 2 
}
}