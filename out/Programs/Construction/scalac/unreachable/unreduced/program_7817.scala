package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B() extends T_A[T_B[T_A[Char]]]
case class CC_C(a: Boolean, b: T_B[T_B[CC_B]], c: T_A[Byte]) extends T_B[T_B[T_A[CC_B]]]
case class CC_D(a: CC_C) extends T_B[T_B[T_A[CC_B]]]
case class CC_E() extends T_B[T_B[T_A[CC_B]]]

val v_a: T_B[T_B[T_A[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_)) => 0 
  case CC_D(CC_C(_, _, _)) => 1 
  case CC_E() => 2 
}
}