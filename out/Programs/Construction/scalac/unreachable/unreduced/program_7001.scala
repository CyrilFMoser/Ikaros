package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: Char) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[T_A[(Int,Byte)]], b: Boolean) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(CC_A(_, 'x'), CC_B(_, _)) => 3 
  case CC_C(CC_A(_, _), CC_B(_, _)) => 4 
}
}