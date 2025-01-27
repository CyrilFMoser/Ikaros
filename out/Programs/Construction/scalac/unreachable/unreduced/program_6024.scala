package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Byte], b: T_A[T_A[Int]]) extends T_A[Byte]
case class CC_B(a: T_B[(Byte,CC_A), (CC_A,Boolean)], b: Byte) extends T_A[Byte]
case class CC_C(a: CC_A) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _), _), _) => 1 
  case CC_A(CC_A(CC_C(_), _), _) => 2 
  case CC_A(CC_B(_, _), _) => 3 
  case CC_A(CC_C(CC_A(_, _)), _) => 4 
  case CC_B(_, _) => 5 
  case CC_C(CC_A(CC_A(_, _), _)) => 6 
  case CC_C(CC_A(CC_B(_, _), _)) => 7 
  case CC_C(CC_A(CC_C(_), _)) => 8 
}
}