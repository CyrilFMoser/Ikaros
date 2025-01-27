package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B[C](a: CC_A) extends T_B[C]
case class CC_C() extends T_B[T_A[T_B[Boolean]]]
case class CC_D(a: (Boolean,Boolean), b: CC_A) extends T_B[T_A[T_B[Boolean]]]

val v_a: T_B[T_A[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C() => 1 
  case CC_D((_,_), _) => 2 
}
}