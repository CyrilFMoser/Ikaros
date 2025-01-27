package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_B[Boolean], c: T_B[T_A[Char]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A) extends T_A[T_B[T_B[Boolean]]]
case class CC_C(a: CC_A) extends T_B[T_B[T_B[CC_A]]]
case class CC_D(a: CC_C) extends T_B[T_B[T_B[CC_A]]]
case class CC_E(a: Byte) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
  case CC_D(CC_C(CC_A(_, _, _))) => 1 
  case CC_E(_) => 2 
}
}