package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Char]], c: T_A[(Boolean,Int)]) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[Int]]
case class CC_C(a: CC_A, b: (T_A[CC_B],T_A[CC_A]), c: Int) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}