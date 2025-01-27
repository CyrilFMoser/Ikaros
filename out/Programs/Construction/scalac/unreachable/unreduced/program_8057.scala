package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[(T_A[Boolean],T_B[Char])]
case class CC_B(a: T_B[T_B[Boolean]], b: T_A[T_A[Char]]) extends T_B[T_B[T_B[CC_A]]]
case class CC_C() extends T_B[T_B[T_B[CC_A]]]
case class CC_D(a: CC_B, b: CC_A) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[T_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
  case CC_D(_, _) => 2 
}
}