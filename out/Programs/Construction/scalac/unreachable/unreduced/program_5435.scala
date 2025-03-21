package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Byte, Int]) extends T_A[T_A[Int]]
case class CC_B(a: (Byte,Byte), b: T_A[CC_A]) extends T_A[T_A[Int]]
case class CC_C(a: T_A[CC_A]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_), _) => 1 
}
}
// This is not matched: CC_C(_)