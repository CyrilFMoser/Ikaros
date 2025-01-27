package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, T_A[C, C]]) extends T_A[C, (T_A[Boolean, Boolean],T_A[Boolean, Byte])]
case class CC_B[D](a: CC_A[CC_A[D]]) extends T_A[D, (T_A[Boolean, Boolean],T_A[Boolean, Byte])]
case class CC_C(a: CC_A[Boolean]) extends T_A[T_A[(Byte,Int), CC_B[Int]], Char]

val v_a: T_A[Int, (T_A[Boolean, Boolean],T_A[Boolean, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}