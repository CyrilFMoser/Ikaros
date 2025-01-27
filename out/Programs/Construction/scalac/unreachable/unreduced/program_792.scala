package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D]) extends T_A[Char, D]
case class CC_B[E](a: CC_A[T_A[Char, Char]]) extends T_A[Char, E]
case class CC_C[F](a: T_B[F]) extends T_B[F]
case class CC_D[G](a: T_A[G, G]) extends T_B[G]
case class CC_E() extends T_B[((Boolean,Byte),(Char,Byte))]

val v_a: T_B[((Boolean,Byte),(Char,Byte))] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
  case CC_C(CC_D(_)) => 1 
  case CC_D(_) => 2 
  case CC_E() => 3 
}
}
// This is not matched: CC_C(CC_E())