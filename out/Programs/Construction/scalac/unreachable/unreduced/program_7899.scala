package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Byte],T_A[Boolean]), b: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: Byte) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(0) => 1 
  case CC_B(_) => 2 
}
}