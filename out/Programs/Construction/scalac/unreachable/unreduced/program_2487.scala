package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_A[CC_A[Boolean]], b: T_B[CC_A[Int]], c: CC_A[T_A[Char]]) extends T_A[T_A[T_A[(Boolean,Char)]]]
case class CC_C(a: T_B[T_A[CC_B]], b: CC_B, c: Boolean) extends T_B[T_A[T_B[CC_B]]]

val v_a: T_A[T_A[T_A[(Boolean,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}