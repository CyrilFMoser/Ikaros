package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[(CC_A,CC_A)], b: Boolean, c: CC_A) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B(_, true, _) => 2 
  case CC_B(_, false, _) => 3 
}
}