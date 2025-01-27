package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[T_A[(Boolean,Char)]], c: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[Byte], b: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_A, b: CC_A, c: CC_B) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}