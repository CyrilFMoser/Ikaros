package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B(a: T_B[(Char,Byte)], b: T_A[CC_A[(Boolean,Int)]], c: CC_A[CC_A[Boolean]]) extends T_A[(CC_A[Int],(Int,Byte))]
case class CC_C(a: T_B[T_B[CC_B]], b: T_A[CC_B], c: T_B[T_B[CC_B]]) extends T_A[T_A[T_B[CC_B]]]
case class CC_D(a: T_A[T_B[(Byte,Boolean)]], b: CC_C) extends T_B[T_A[CC_B]]
case class CC_E[D]() extends T_B[T_A[CC_B]]

val v_a: T_B[T_A[CC_B]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), CC_C(_, CC_A(), _)) => 0 
  case CC_E() => 1 
}
}