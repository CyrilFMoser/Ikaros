package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Int) extends T_A[B]
case class CC_B(a: T_A[T_A[Int]], b: T_A[Byte], c: T_A[Byte]) extends T_A[T_A[CC_A[Int]]]

val v_a: T_A[T_A[CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_), CC_A(_)) => 1 
}
}