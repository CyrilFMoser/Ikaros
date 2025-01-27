package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_B[Byte]]) extends T_A[T_B[Byte]]
case class CC_B(a: CC_A) extends T_A[T_B[Byte]]
case class CC_C(a: T_B[T_A[CC_A]], b: T_A[CC_A], c: CC_A) extends T_A[T_B[Byte]]
case class CC_D[C](a: C, b: CC_A) extends T_B[C]
case class CC_E[D](a: D) extends T_B[D]
case class CC_F() extends T_B[Int]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _)) => 0 
  case CC_E(_) => 1 
}
}