package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int, b: T_A[D, Boolean], c: D) extends T_A[D, T_A[T_B[Byte], T_A[Char, (Boolean,Int)]]]
case class CC_B[E](a: CC_A[E], b: Boolean) extends T_A[E, T_A[T_B[Byte], T_A[Char, (Boolean,Int)]]]
case class CC_C[F](a: CC_B[F]) extends T_A[F, T_A[T_B[Byte], T_A[Char, (Boolean,Int)]]]
case class CC_D[G](a: CC_B[G], b: CC_C[G]) extends T_B[G]

val v_a: T_A[Byte, T_A[T_B[Byte], T_A[Char, (Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, 0), _) => 1 
  case CC_C(CC_B(CC_A(_, _, _), _)) => 2 
}
}
// This is not matched: CC_B(CC_A(_, _, _), _)