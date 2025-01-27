package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: Char) extends T_A[T_B[T_B[(Boolean,Int)]]]
case class CC_B(a: (Char,T_B[CC_A]), b: T_A[Int], c: T_A[T_B[CC_A]]) extends T_A[T_B[T_B[(Boolean,Int)]]]
case class CC_C() extends T_A[T_B[T_B[(Boolean,Int)]]]

val v_a: T_A[T_B[T_B[(Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C() => 3 
}
}