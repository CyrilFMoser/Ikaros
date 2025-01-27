package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[Boolean, Boolean], T_A[T_A[Boolean, Boolean], T_A[Boolean, Boolean]]]) extends T_A[CC_A[T_A[Boolean, (Int,Char)]], T_A[CC_A[T_A[Boolean, (Int,Char)]], CC_A[T_A[Boolean, (Int,Char)]]]]
case class CC_C(a: Boolean, b: T_A[CC_A[Char], Byte]) extends T_A[Int, T_A[Int, Int]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}