package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_B[T_A[Byte]], b: T_B[(Byte,Byte)], c: T_A[CC_A[Char]]) extends T_B[T_A[Byte]]
case class CC_C() extends T_B[T_A[Byte]]
case class CC_D() extends T_B[T_A[Byte]]

val v_a: T_B[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C()