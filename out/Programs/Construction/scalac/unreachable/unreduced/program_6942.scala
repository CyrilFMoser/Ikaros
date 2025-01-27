package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[(Byte,Byte), T_B], b: T_B, c: Byte) extends T_A[Boolean, T_A[T_A[Int, T_B], T_A[T_B, Int]]]
case class CC_B(a: T_B) extends T_A[Boolean, T_A[T_A[Int, T_B], T_A[T_B, Int]]]
case class CC_C(a: T_A[CC_B, T_A[T_B, CC_B]]) extends T_A[Boolean, T_A[T_A[Int, T_B], T_A[T_B, Int]]]
case class CC_D(a: T_B) extends T_B

val v_a: T_A[Boolean, T_A[T_A[Int, T_B], T_A[T_B, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(CC_D(_)), _) => 0 
  case CC_B(CC_D(CC_D(_))) => 1 
  case CC_C(_) => 2 
}
}