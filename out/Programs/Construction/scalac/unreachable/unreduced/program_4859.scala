package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean, b: Int, c: (T_B,T_A[T_B])) extends T_A[T_A[T_B]]
case class CC_B(a: CC_A) extends T_A[T_A[T_B]]
case class CC_C(a: T_A[T_A[T_B]], b: T_B, c: T_B) extends T_A[T_A[T_B]]
case class CC_D(a: Char) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_D(_),_)) => 0 
  case CC_B(CC_A(_, _, (_,_))) => 1 
  case CC_C(CC_A(_, _, _), CC_D(_), CC_D(_)) => 2 
  case CC_C(CC_B(CC_A(_, _, _)), CC_D(_), CC_D(_)) => 3 
  case CC_C(CC_C(_, CC_D(_), CC_D(_)), CC_D(_), CC_D(_)) => 4 
}
}