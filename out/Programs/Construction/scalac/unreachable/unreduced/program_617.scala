package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Int, b: (T_A[CC_A],Boolean)) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(12, (_,_)) => 1 
}
}
// This is not matched: CC_B(_, (_,_))