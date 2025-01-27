package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean) extends T_A[Byte, D]
case class CC_B(a: T_A[(Boolean,(Char,Byte)), T_A[Boolean, Boolean]]) extends T_A[Byte, T_A[T_A[Byte, Int], Byte]]
case class CC_C() extends T_B[Int]
case class CC_D(a: T_A[Byte, CC_A[CC_C]], b: Boolean, c: CC_C) extends T_B[Int]
case class CC_E(a: CC_B, b: CC_D, c: T_B[CC_A[Byte]]) extends T_B[Int]

val v_a: T_A[Byte, T_A[T_A[Byte, Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}