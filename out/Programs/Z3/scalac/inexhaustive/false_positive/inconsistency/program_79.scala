package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[(Boolean,Int), D]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: T_B[F], b: T_A[F, F]) extends T_B[F]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _) => 1 
}
}
// This is not matched: (CC_A Byte (T_A Byte (Tuple (Tuple Boolean Char) T_B)))