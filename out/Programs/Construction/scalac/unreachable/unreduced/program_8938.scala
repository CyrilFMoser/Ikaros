package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[Boolean, T_A[Int, Char]], b: T_B[Byte]) extends T_A[T_B[Byte], Byte]
case class CC_B() extends T_A[T_B[Byte], Byte]
case class CC_C[D]() extends T_B[D]

val v_a: T_A[T_B[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
  case CC_B() => 1 
}
}