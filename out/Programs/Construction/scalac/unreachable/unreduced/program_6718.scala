package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,Byte)], b: T_A[T_A[Boolean]]) extends T_A[(T_A[Boolean],T_A[Int])]
case class CC_B() extends T_A[(T_A[Boolean],T_A[Int])]

val v_a: T_A[(T_A[Boolean],T_A[Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}