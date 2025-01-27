package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[(T_A[Int, Boolean],T_A[Boolean, Boolean]), Int]
case class CC_B(a: T_A[T_A[CC_A, (Byte,Boolean)], CC_A]) extends T_A[(T_A[Int, Boolean],T_A[Boolean, Boolean]), Int]

val v_a: T_A[(T_A[Int, Boolean],T_A[Boolean, Boolean]), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}