package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: Boolean) extends T_A[T_A[Int]]
case class CC_B() extends T_A[T_A[Int]]
case class CC_C(a: T_A[(CC_B,(Int,Boolean))]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}