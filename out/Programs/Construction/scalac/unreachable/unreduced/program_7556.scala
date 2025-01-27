package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[(Char,Int)]], b: Byte, c: T_A[T_B[Int, (Int,Char)]]) extends T_A[T_A[Byte]]
case class CC_C() extends T_A[T_A[Byte]]
case class CC_D[E, F](a: E, b: E) extends T_B[F, E]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C()