package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[(T_A[Boolean],T_A[Byte])]
case class CC_B() extends T_A[(T_A[Boolean],T_A[Byte])]
case class CC_C(a: Int) extends T_A[T_A[Char]]

val v_a: T_A[(T_A[Boolean],T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}