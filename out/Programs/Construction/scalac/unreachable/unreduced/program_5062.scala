package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int) extends T_A[T_B]
case class CC_B(a: (T_A[CC_A],T_A[Int]), b: Char) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((_,_), 'x') => 1 
}
}
// This is not matched: CC_B((_,_), _)