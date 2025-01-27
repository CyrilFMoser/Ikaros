package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C) extends T_A[C]
case class CC_B(a: T_B[(Byte,Char)], b: T_A[T_B[Boolean]]) extends T_A[T_A[T_B[(Int,Char)]]]
case class CC_C() extends T_B[Char]
case class CC_D(a: Boolean, b: CC_A[CC_B], c: Boolean) extends T_B[Char]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, CC_A(CC_B(_, _)), _) => 1 
}
}