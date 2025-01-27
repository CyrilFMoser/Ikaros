package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[(Byte,T_A[Boolean, Boolean]), T_A[Boolean, Int]]
case class CC_B() extends T_A[(Byte,T_A[Boolean, Boolean]), T_A[Boolean, Int]]
case class CC_C(a: T_A[Byte, Boolean]) extends T_A[(Byte,T_A[Boolean, Boolean]), T_A[Boolean, Int]]

val v_a: T_A[(Byte,T_A[Boolean, Boolean]), T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}