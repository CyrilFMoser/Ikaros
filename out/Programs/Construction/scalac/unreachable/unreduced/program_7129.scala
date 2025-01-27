package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Byte, Boolean], Char], b: T_A[T_A[Byte]]) extends T_A[T_A[T_B[Int, Boolean]]]
case class CC_B(a: ((Byte,CC_A),Int)) extends T_A[T_A[T_B[Int, Boolean]]]
case class CC_C(a: Byte, b: CC_B) extends T_B[T_B[T_B[CC_A, CC_B], CC_A], T_A[T_A[CC_A]]]
case class CC_D(a: Boolean, b: (T_A[CC_C],CC_A)) extends T_B[T_B[T_B[CC_A, CC_B], CC_A], T_A[T_A[CC_A]]]

val v_a: T_A[T_A[T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(((_,_),_)) => 1 
}
}