package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: (T_A[Byte],T_A[Boolean]), c: Char) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A, b: CC_A, c: (T_A[CC_A],Byte)) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: T_A[CC_A]) extends T_A[T_A[T_A[Boolean]]]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), 'x') => 0 
  case CC_A(_, (_,_), _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_) => 3 
}
}