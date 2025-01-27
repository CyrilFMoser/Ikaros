package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[T_A[(Boolean,Int)]], c: Char) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C() extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)