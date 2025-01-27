package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Byte, b: Int, c: T_A[T_A[(Char,Char), Int], Char]) extends T_A[T_A[T_B[(Boolean,Byte)], (Char,Int)], T_A[Char, Int]]
case class CC_B[D](a: D, b: D, c: D) extends T_A[T_A[D, D], D]
case class CC_C(a: T_B[T_B[CC_A]], b: Char) extends T_A[T_A[T_B[(Boolean,Byte)], (Char,Int)], T_A[Char, Int]]
case class CC_D[E](a: CC_A) extends T_B[E]
case class CC_E[F](a: T_A[T_A[T_B[F], T_B[F]], T_B[F]], b: CC_D[F]) extends T_B[F]

val v_a: T_A[T_A[T_B[(Boolean,Byte)], (Char,Int)], T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_D(_), _) => 1 
  case CC_C(CC_E(_, _), _) => 2 
}
}