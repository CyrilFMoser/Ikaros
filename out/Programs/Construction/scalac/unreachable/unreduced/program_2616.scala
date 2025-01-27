package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[(Int,Boolean)]]]
case class CC_B(a: T_A[T_B[(Char,Boolean)]]) extends T_A[T_A[T_A[(Int,Boolean)]]]
case class CC_C(a: T_B[CC_B], b: T_B[T_B[CC_B]], c: Boolean) extends T_B[CC_B]
case class CC_D(a: T_A[T_B[CC_B]], b: T_A[T_B[CC_B]]) extends T_B[CC_B]
case class CC_E[C](a: T_A[C], b: C) extends T_B[C]

val v_a: T_A[T_A[T_A[(Int,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}