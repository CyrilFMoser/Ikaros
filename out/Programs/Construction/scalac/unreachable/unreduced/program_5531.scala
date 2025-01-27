package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Int, c: Boolean) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: CC_A, b: (T_A[T_B],T_B), c: CC_A) extends T_A[T_A[T_A[T_B]]]

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, true) => 0 
  case CC_A(_, _, false) => 1 
  case CC_B(CC_A(_, _, _), (_,_), CC_A(_, _, true)) => 2 
  case CC_B(CC_A(_, _, _), (_,_), CC_A(_, _, false)) => 3 
}
}