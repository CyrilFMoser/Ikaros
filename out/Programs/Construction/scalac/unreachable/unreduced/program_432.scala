package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C) extends T_A[C]
case class CC_B(a: (T_A[Int],T_A[Char]), b: Boolean) extends T_A[T_B[Byte]]
case class CC_C() extends T_B[Byte]
case class CC_D(a: T_B[CC_B], b: T_A[T_B[Byte]]) extends T_B[T_A[T_B[CC_C]]]
case class CC_E(a: T_A[(CC_C,(Int,Char))], b: CC_A[CC_C]) extends T_B[T_A[T_B[CC_C]]]

val v_a: T_B[T_A[T_B[CC_C]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_)) => 0 
  case CC_D(_, CC_B(_, _)) => 1 
  case CC_E(_, _) => 2 
}
}