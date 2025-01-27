package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: Char, b: D) extends T_A[D]
case class CC_C() extends T_A[T_A[(Char,Boolean)]]
case class CC_D(a: T_A[T_A[Char]], b: T_B[T_A[Int]]) extends T_B[T_A[CC_B[CC_C]]]
case class CC_E() extends T_B[T_A[CC_B[CC_C]]]

val v_a: T_B[T_A[CC_B[CC_C]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E() => 1 
}
}