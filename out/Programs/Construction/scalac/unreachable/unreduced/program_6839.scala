package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,(Int,Boolean))]) extends T_A[T_A[Byte]]
case class CC_B[B](a: B) extends T_A[T_A[Byte]]
case class CC_C(a: CC_B[CC_B[CC_A]], b: CC_B[CC_B[CC_A]], c: CC_A) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), CC_B(_), CC_A(_)) => 2 
}
}