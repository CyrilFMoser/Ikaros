package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Char]], c: T_A[(Byte,Byte)]) extends T_A[T_A[(Int,Byte)]]
case class CC_B[B]() extends T_A[B]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}