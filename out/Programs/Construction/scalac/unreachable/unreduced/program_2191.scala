package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]], b: T_B[Int]) extends T_A[(T_B[Int],T_B[Boolean])]
case class CC_B(a: Boolean) extends T_A[(T_B[Int],T_B[Boolean])]
case class CC_C(a: CC_A, b: ((CC_A,CC_A),T_B[CC_B]), c: T_B[CC_B]) extends T_A[(T_B[Int],T_B[Boolean])]
case class CC_D[C](a: Char, b: C) extends T_B[C]

val v_a: T_A[(T_B[Int],T_B[Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_, _), _, CC_D(_, CC_B(_))) => 1 
}
}
// This is not matched: CC_A(_, _)