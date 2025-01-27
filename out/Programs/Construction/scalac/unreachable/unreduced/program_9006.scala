package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[T_A[T_A[Char, Int], Byte], E]
case class CC_B[F](a: T_B[T_B[F, F], F], b: CC_A[F], c: CC_A[F]) extends T_A[T_A[T_A[Char, Int], Byte], F]
case class CC_C() extends T_B[CC_A[T_B[Boolean, (Int,Char)]], Int]
case class CC_D(a: T_A[CC_C, Byte], b: CC_B[CC_B[CC_C]], c: (T_B[CC_C, CC_C],CC_A[CC_C])) extends T_B[CC_A[T_B[Boolean, (Int,Char)]], Int]
case class CC_E(a: T_A[Boolean, CC_C]) extends T_B[CC_A[T_B[Boolean, (Int,Char)]], Int]

val v_a: T_B[CC_A[T_B[Boolean, (Int,Char)]], Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
  case CC_E(_) => 2 
}
}