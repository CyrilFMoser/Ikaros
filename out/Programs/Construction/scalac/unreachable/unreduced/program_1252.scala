package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: Char) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[Int]], b: Char) extends T_A[T_A[Int]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(_, _), _) => 3 
  case CC_C(CC_B(_, _), CC_A(_, _)) => 4 
}
}