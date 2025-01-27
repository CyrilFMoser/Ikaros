package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_B) extends T_A[T_A[(T_B,Boolean)]]
case class CC_B(a: T_A[T_B], b: T_B, c: (CC_A[T_B],T_B)) extends T_A[T_A[(T_B,Boolean)]]

val v_a: T_A[T_A[(T_B,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, (CC_A(_, _),_)) => 1 
}
}