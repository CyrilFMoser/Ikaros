package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[(Int,T_A[Boolean])]
case class CC_B(a: T_A[T_A[Boolean]], b: T_A[T_A[CC_A]], c: CC_A) extends T_A[(Int,T_A[Boolean])]

val v_a: T_A[(Int,T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}