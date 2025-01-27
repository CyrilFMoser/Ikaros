package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B() extends T_A[Int]
case class CC_C(a: ((CC_A,CC_A),T_A[Int]), b: CC_A) extends T_A[Int]
case class CC_D[C](a: C) extends T_B[C]
case class CC_E(a: T_B[CC_C], b: T_A[CC_B]) extends T_B[CC_C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()