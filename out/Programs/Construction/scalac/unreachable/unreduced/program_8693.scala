package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: Char) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[CC_B[Byte], CC_B[Boolean]]) extends T_A[T_A[CC_B[CC_B[Int]], CC_B[CC_B[Int]]], CC_B[CC_B[Int]]]

val v_a: T_A[T_A[CC_B[CC_B[Int]], CC_B[CC_B[Int]]], CC_B[CC_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_A(_, _), _)) => 1 
  case CC_B(CC_A(CC_B(_), _)) => 2 
  case CC_B(CC_A(CC_C(_), _)) => 3 
  case CC_B(CC_B(CC_A(_, _))) => 4 
  case CC_B(CC_B(CC_B(_))) => 5 
  case CC_B(CC_B(CC_C(_))) => 6 
  case CC_B(CC_C(_)) => 7 
  case CC_C(_) => 8 
}
}