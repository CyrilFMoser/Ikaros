package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[(T_A[Int],T_A[Char])]
case class CC_B(a: CC_A, b: Int) extends T_A[(T_A[Int],T_A[Char])]
case class CC_C(a: CC_B, b: T_A[CC_B], c: T_A[T_A[CC_A]]) extends T_A[(T_A[Int],T_A[Char])]

val v_a: T_A[(T_A[Int],T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}