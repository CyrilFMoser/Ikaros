package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Boolean]], b: T_B[T_B[Char]]) extends T_A[T_B[(Char,Int)]]
case class CC_B[C](a: T_B[C]) extends T_B[C]
case class CC_C() extends T_B[T_B[CC_B[CC_A]]]
case class CC_D(a: T_A[T_B[CC_C]]) extends T_B[T_B[CC_B[CC_A]]]

val v_a: T_B[T_B[CC_B[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_B(CC_C()) => 1 
  case CC_B(CC_D(_)) => 2 
  case CC_C() => 3 
  case CC_D(_) => 4 
}
}