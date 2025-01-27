package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Boolean) extends T_A[T_B]
case class CC_B(a: ((T_B,T_B),T_A[Int])) extends T_B
case class CC_C(a: T_A[Boolean], b: T_A[T_B]) extends T_B
case class CC_D[C]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(((_,_),_)) => 0 
  case CC_C(_, CC_A(_)) => 1 
  case CC_D() => 2 
}
}