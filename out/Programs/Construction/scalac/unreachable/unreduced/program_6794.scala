package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Int],T_B[Boolean]), b: T_A[Boolean]) extends T_A[Boolean]
case class CC_B[C](a: C, b: T_A[Boolean]) extends T_B[C]
case class CC_C(a: T_B[CC_A]) extends T_B[CC_B[T_B[CC_A]]]
case class CC_D(a: Char) extends T_B[CC_B[T_B[CC_A]]]

val v_a: T_B[CC_B[T_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), CC_A((_,_), CC_A(_, _))) => 0 
  case CC_C(CC_B(CC_A(_, _), _)) => 1 
  case CC_D(_) => 2 
}
}