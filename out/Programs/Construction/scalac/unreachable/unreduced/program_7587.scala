package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(T_A[Char],T_A[Byte])]
case class CC_B(a: CC_A, b: T_A[Int]) extends T_A[(T_A[Char],T_A[Byte])]

val v_a: T_A[(T_A[Char],T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}