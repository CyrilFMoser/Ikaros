package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Char, (Int,Boolean)], (T_A[Int, Byte],T_A[Char, Boolean])]
case class CC_B[D](a: CC_A[D], b: D, c: T_A[D, T_A[D, D]]) extends T_A[T_A[Char, (Int,Boolean)], (T_A[Int, Byte],T_A[Char, Boolean])]

val v_a: T_A[T_A[Char, (Int,Boolean)], (T_A[Int, Byte],T_A[Char, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}