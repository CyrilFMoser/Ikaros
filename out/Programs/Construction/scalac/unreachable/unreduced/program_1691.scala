package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: C, c: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[T_A[Byte]], b: T_A[T_A[Int]], c: CC_A[CC_A[(Boolean,Boolean)]]) extends T_A[CC_A[T_A[Byte]]]
case class CC_C(a: CC_B, b: T_A[CC_A[(Int,Boolean)]], c: T_B[T_B[Byte]]) extends T_A[CC_A[T_A[Byte]]]
case class CC_D() extends T_B[CC_C]
case class CC_E(a: CC_C) extends T_B[CC_C]
case class CC_F() extends T_B[Byte]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_C(_, _, _)) => 1 
}
}