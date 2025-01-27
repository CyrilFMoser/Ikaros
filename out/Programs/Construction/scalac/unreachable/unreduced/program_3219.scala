package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[T_A[C, C], C], b: T_A[C, C], c: Char) extends T_A[C, (T_A[Boolean, Boolean],(Int,(Int,Char)))]
case class CC_B[E]() extends T_A[E, (T_A[Boolean, Boolean],(Int,(Int,Char)))]

val v_a: T_A[Int, (T_A[Boolean, Boolean],(Int,(Int,Char)))] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 'x') => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
}
}