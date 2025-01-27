package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: CC_A[T_A[Byte]], b: Boolean, c: CC_A[(Int,Int)]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
}
}