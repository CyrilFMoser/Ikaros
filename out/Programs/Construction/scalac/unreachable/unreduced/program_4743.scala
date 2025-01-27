package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_A[C], c: T_B[C]) extends T_A[C]
case class CC_B[D](a: CC_A[D], b: T_A[D], c: CC_A[D]) extends T_A[D]
case class CC_C(a: T_B[CC_B[Byte]]) extends T_B[T_A[Int]]
case class CC_D() extends T_B[T_A[Int]]
case class CC_E(a: (CC_C,T_B[CC_D]), b: T_A[CC_B[Byte]]) extends T_B[T_A[Int]]

val v_a: T_B[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D() => 1 
  case CC_E((CC_C(_),_), CC_A(CC_A(_, _, _), CC_A(_, _, _), _)) => 2 
  case CC_E((CC_C(_),_), CC_A(CC_A(_, _, _), CC_B(_, _, _), _)) => 3 
  case CC_E((CC_C(_),_), CC_A(CC_B(_, _, _), CC_A(_, _, _), _)) => 4 
  case CC_E((CC_C(_),_), CC_A(CC_B(_, _, _), CC_B(_, _, _), _)) => 5 
  case CC_E((CC_C(_),_), CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _))) => 6 
}
}
// This is not matched: CC_E((CC_C(_),_), CC_B(CC_A(_, _, _), CC_B(_, _, _), CC_A(_, _, _)))