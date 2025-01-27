package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Byte, Int], Boolean], T_A[(Byte,Boolean), T_A[Int, Boolean]]]
case class CC_B(a: Int, b: ((CC_A,CC_A),CC_A), c: T_A[T_A[CC_A, CC_A], CC_A]) extends T_A[T_A[T_A[Byte, Int], Boolean], T_A[(Byte,Boolean), T_A[Int, Boolean]]]

val v_a: T_A[T_A[T_A[Byte, Int], Boolean], T_A[(Byte,Boolean), T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}