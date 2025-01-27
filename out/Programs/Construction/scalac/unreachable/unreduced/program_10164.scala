package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[CC_A[T_B]], b: (T_A[T_B],T_A[T_B])) extends T_A[T_A[T_B]]

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}