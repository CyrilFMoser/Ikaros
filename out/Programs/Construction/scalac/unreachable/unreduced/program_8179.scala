package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D, E](a: D) extends T_A[D]
case class CC_C(a: CC_B[T_A[Byte], CC_B[Boolean, Boolean]], b: Char, c: (CC_A[Int],T_B[Byte])) extends T_A[T_A[CC_A[Boolean]]]
case class CC_D(a: CC_A[CC_B[CC_C, CC_C]]) extends T_B[T_A[CC_B[CC_C, CC_C]]]
case class CC_E(a: CC_B[T_A[Char], T_A[CC_D]]) extends T_B[T_A[CC_B[CC_C, CC_C]]]
case class CC_F() extends T_B[T_A[CC_B[CC_C, CC_C]]]

val v_a: T_B[T_A[CC_B[CC_C, CC_C]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_)) => 0 
  case CC_E(CC_B(_)) => 1 
  case CC_F() => 2 
}
}