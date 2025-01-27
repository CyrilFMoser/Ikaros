package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Char]], b: T_B[Boolean], c: T_B[T_B[(Boolean,Boolean)]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[CC_A], b: Char, c: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C() extends T_A[T_A[T_A[Int]]]
case class CC_D[C](a: CC_A, b: T_A[C], c: T_B[C]) extends T_B[C]
case class CC_E[D]() extends T_B[D]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_D(_, _, _)) => 0 
  case CC_D(_, _, CC_E()) => 1 
  case CC_E() => 2 
}
}