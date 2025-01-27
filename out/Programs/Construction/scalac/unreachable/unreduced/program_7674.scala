package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[Boolean, C]
case class CC_B[D]() extends T_A[Boolean, D]
case class CC_C(a: CC_A[(Boolean,(Boolean,Boolean))], b: CC_B[T_A[Int, T_B]], c: T_A[Boolean, Boolean]) extends T_B

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}