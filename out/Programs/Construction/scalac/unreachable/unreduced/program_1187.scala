package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]], b: T_A[T_A[Char]], c: T_A[T_B[(Boolean,Int)]]) extends T_A[T_B[T_A[(Byte,Int)]]]
case class CC_B(a: (CC_A,T_A[CC_A]), b: CC_A, c: T_B[T_A[(Int,Char)]]) extends T_A[T_B[T_A[(Byte,Int)]]]
case class CC_C(a: (CC_A,T_B[Byte])) extends T_A[T_B[T_A[(Byte,Int)]]]
case class CC_D(a: T_B[CC_A]) extends T_B[T_A[CC_B]]
case class CC_E() extends T_B[T_A[CC_B]]
case class CC_F() extends T_B[T_A[CC_B]]

val v_a: T_B[T_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_F() => 1 
}
}
// This is not matched: CC_E()