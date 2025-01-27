package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Byte, D], b: T_A[D, D], c: T_A[Byte, D]) extends T_A[Byte, D]
case class CC_B(a: T_A[Boolean, T_B[Int]]) extends T_B[Int]
case class CC_C() extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}