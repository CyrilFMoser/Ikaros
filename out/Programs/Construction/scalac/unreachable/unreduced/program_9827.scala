package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,T_A[Boolean, Boolean])) extends T_A[T_A[T_A[C, C], C], C]
case class CC_B[D]() extends T_A[T_A[T_A[D, D], D], D]
case class CC_C(a: CC_B[T_A[Boolean, Byte]], b: CC_B[(Byte,Char)], c: T_A[T_A[(Byte,Int), Int], CC_B[Byte]]) extends T_A[T_A[T_A[CC_B[Byte], CC_B[Byte]], CC_B[Byte]], CC_B[Byte]]

val v_a: T_A[T_A[T_A[CC_B[Byte], CC_B[Byte]], CC_B[Byte]], CC_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), CC_B(), _) => 1 
}
}
// This is not matched: CC_A(_)