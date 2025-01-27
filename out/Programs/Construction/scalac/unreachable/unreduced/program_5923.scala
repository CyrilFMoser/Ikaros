package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Byte, T_B[Char, Char]]) extends T_A[(T_A[Int],(Byte,Byte))]
case class CC_B() extends T_B[T_B[T_A[CC_A], T_A[CC_A]], CC_A]
case class CC_C(a: T_B[T_A[CC_B], T_A[CC_A]]) extends T_B[T_B[T_A[CC_A], T_A[CC_A]], CC_A]
case class CC_D(a: Byte) extends T_B[T_B[T_A[CC_A], T_A[CC_A]], CC_A]

val v_a: T_B[T_B[T_A[CC_A], T_A[CC_A]], CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_B()