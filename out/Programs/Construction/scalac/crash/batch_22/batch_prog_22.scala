package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[(Char,Byte)]]]
case class CC_B(a: T_A[Char], b: CC_A) extends T_A[T_A[T_B[(Char,Byte)]]]
case class CC_C[C](a: CC_A, b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_D(a: T_B[T_B[CC_B]], b: T_A[T_A[CC_B]], c: T_A[Byte]) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
}
}