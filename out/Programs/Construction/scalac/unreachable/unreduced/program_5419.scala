package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (T_A[Int, Boolean],T_A[Byte, Boolean]), c: T_A[C, C]) extends T_A[C, (T_A[Byte, Char],T_A[Char, (Int,Char)])]
case class CC_B(a: Int) extends T_A[T_A[Char, T_A[Int, Char]], Boolean]
case class CC_C(a: CC_B, b: Boolean, c: CC_B) extends T_A[CC_A[Byte], (T_A[Byte, Char],T_A[Char, (Int,Char)])]

val v_a: T_A[CC_A[Byte], (T_A[Byte, Char],T_A[Char, (Int,Char)])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_B(_), _, CC_B(_)) => 1 
}
}