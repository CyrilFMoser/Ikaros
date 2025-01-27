package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]], b: T_A[Char], c: T_B[((Char,Byte),(Int,Char))]) extends T_A[T_A[T_B[Char]]]
case class CC_B(a: ((Int,CC_A),T_B[Char]), b: Int) extends T_A[T_A[T_B[Char]]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_A[T_B[Char]]]
case class CC_D[C](a: T_A[C], b: T_A[C]) extends T_B[C]
case class CC_E[D](a: T_B[D]) extends T_B[D]
case class CC_F[E, F]() extends T_B[E]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_D(_, _)) => 1 
  case CC_E(CC_E(CC_D(_, _))) => 2 
  case CC_E(CC_E(CC_E(_))) => 3 
  case CC_E(CC_E(CC_F())) => 4 
  case CC_E(CC_F()) => 5 
  case CC_F() => 6 
}
}