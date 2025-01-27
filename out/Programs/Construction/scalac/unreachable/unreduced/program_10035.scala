package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C]) extends T_A[C]
case class CC_B(a: Int, b: T_A[T_A[(Boolean,Int)]], c: T_B[Char]) extends T_B[Boolean]
case class CC_C(a: Boolean) extends T_B[Boolean]
case class CC_D(a: T_A[CC_C], b: T_A[CC_A[Byte]], c: Char) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), _) => 0 
  case CC_C(_) => 1 
  case CC_D(_, _, _) => 2 
}
}