package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Char], b: T_B[T_A[(Char,Char)]]) extends T_A[T_B[T_B[(Int,Char)]]]
case class CC_B(a: T_B[CC_A], b: T_B[Byte]) extends T_A[T_B[T_B[(Int,Char)]]]
case class CC_C(a: T_A[CC_B], b: Boolean, c: Char) extends T_B[T_A[CC_A]]
case class CC_D() extends T_B[T_A[CC_A]]

val v_a: T_B[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D() => 1 
}
}