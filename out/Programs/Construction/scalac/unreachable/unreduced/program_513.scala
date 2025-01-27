package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: T_A[T_A[Byte]], c: Byte) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Byte, b: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: (T_A[CC_B],CC_A), b: CC_A, c: Char) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}