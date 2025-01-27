package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: (T_A[Int],Boolean)) extends T_A[B]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _),_)) => 0 
}
}