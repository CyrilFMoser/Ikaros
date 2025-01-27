package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C() extends T_A[T_B, CC_A[T_A[T_B, Char]]]
case class CC_D(a: T_A[T_B, CC_A[CC_C]], b: T_A[((Boolean,Byte),T_B), CC_A[Byte]]) extends T_B

val v_a: T_A[T_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}