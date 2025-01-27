package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Boolean], c: T_A[T_A[Char]]) extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_B(a: Boolean, b: Byte) extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_C() extends T_A[T_A[T_A[(Boolean,Int)]]]

val v_a: T_A[T_A[T_A[(Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, 0) => 1 
  case CC_B(_, _) => 2 
  case CC_C() => 3 
}
}