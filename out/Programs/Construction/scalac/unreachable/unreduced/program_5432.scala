package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Boolean, c: T_A[C, T_A[C, C]]) extends T_A[T_A[C, (Int,Char)], C]
case class CC_B[D]() extends T_A[T_A[D, (Int,Char)], D]

val v_a: T_A[T_A[Byte, (Int,Char)], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}