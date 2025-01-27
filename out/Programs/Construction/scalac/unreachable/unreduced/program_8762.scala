package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[T_A[Int]], c: T_A[(Byte,Char)]) extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_B[B](a: CC_A, b: B, c: CC_A) extends T_A[T_A[T_A[(Boolean,Int)]]]
case class CC_C(a: CC_A, b: CC_A) extends T_A[T_A[T_A[(Boolean,Int)]]]

val v_a: T_A[T_A[T_A[(Boolean,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, _, _), _) => 2 
}
}