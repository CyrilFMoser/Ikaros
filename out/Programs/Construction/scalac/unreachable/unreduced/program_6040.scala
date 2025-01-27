package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C]) extends T_A[C]
case class CC_B(a: T_A[T_B[Boolean]], b: T_A[T_B[Int]]) extends T_A[T_B[Int]]
case class CC_C() extends T_B[T_B[T_A[CC_B]]]
case class CC_D(a: T_A[CC_B], b: (CC_A[Char],Char), c: Boolean) extends T_B[T_B[T_A[CC_B]]]

val v_a: T_B[T_B[T_A[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(CC_A(_, _), _), (CC_A(_, _),_), _) => 1 
}
}