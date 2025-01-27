package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],T_A[Int]), b: T_A[T_A[Int]], c: T_A[T_B]) extends T_A[Int]
case class CC_B(a: T_A[T_A[Int]], b: Boolean, c: Boolean) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}