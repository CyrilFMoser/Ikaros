package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Byte, T_A[Char, Int]], C]
case class CC_B[D](a: T_A[D, D], b: (T_A[Int, Char],T_A[Char, Boolean])) extends T_A[T_A[Byte, T_A[Char, Int]], D]

val v_a: T_A[T_A[Byte, T_A[Char, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}