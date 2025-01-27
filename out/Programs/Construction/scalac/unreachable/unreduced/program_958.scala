package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: Byte) extends T_A[C]
case class CC_B(a: T_A[Char], b: CC_A[T_A[Byte]], c: T_A[CC_A[Int]]) extends T_A[CC_A[T_A[Int]]]
case class CC_C(a: T_B[(CC_B,CC_B)], b: CC_B, c: CC_B) extends T_B[Char]
case class CC_D() extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B(_, _, _)) => 0 
  case CC_D() => 1 
}
}