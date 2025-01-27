package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: E, b: E, c: CC_A[E]) extends T_A[E]
case class CC_C[F](a: T_B[F, F]) extends T_A[F]
case class CC_D(a: T_A[T_A[(Boolean,Int)]], b: T_A[(Boolean,Char)]) extends T_B[CC_A[CC_B[Char]], T_A[T_A[Char]]]
case class CC_E(a: T_A[CC_D]) extends T_B[CC_C[CC_A[CC_D]], (CC_B[CC_D],((Byte,Boolean),CC_D))]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}