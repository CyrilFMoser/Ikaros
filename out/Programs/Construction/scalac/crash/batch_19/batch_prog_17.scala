package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: T_A[C], b: (Byte,T_A[T_B]), c: (Int,Byte)) extends T_A[C]
case class CC_C[D](a: CC_A[D]) extends T_A[D]
case class CC_D(a: T_A[CC_C[Char]], b: T_A[CC_B[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
}
}