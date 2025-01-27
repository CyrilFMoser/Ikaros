package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: (T_A[Char],T_A[Char])) extends T_A[T_A[(Int,Boolean)]]
case class CC_B(a: CC_A) extends T_A[T_A[(Int,Boolean)]]

val v_a: T_A[T_A[(Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_) => 1 
}
}