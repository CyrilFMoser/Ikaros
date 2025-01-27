package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_A[D, D]]
case class CC_B(a: Byte, b: T_A[T_A[Int, Boolean], T_A[T_A[Int, Boolean], T_A[Int, Boolean]]], c: T_A[T_A[Int, Boolean], (Byte,Int)]) extends T_B[CC_A[CC_A[Boolean]]]
case class CC_C() extends T_B[CC_A[CC_A[Boolean]]]
case class CC_D(a: T_B[T_B[CC_B]], b: (Int,CC_A[(Int,Byte)]), c: T_A[CC_C, T_A[CC_C, CC_C]]) extends T_B[CC_A[CC_A[Boolean]]]

val v_a: T_B[CC_A[CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_), _) => 0 
  case CC_C() => 1 
  case CC_D(_, _, _) => 2 
}
}